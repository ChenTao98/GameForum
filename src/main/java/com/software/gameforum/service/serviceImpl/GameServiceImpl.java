package com.software.gameforum.service.serviceImpl;

import com.software.gameforum.dao.GamesDao;
import com.software.gameforum.dao.UserplaysgamesDao;
import com.software.gameforum.entity.Games;
import com.software.gameforum.entity.Userplaysgames;
import com.software.gameforum.entity.UserplaysgamesExample;
import com.software.gameforum.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class GameServiceImpl implements GameService {
    @Autowired
    private GamesDao gamesDao;
    @Autowired
    private UserplaysgamesDao userplaysgamesDao;

    @Override
    public List<Games> userPlayed(int userId) {
        return gamesDao.selectByPlay(userId);
    }

    @Override
    public List<Games> userFollow(int userId) {
        return gamesDao.selectByFollow(userId);
    }

    @Override
    public int addGamePlayed(int userid, int gameid) {
        UserplaysgamesExample userplaysgamesExample = new UserplaysgamesExample();
        userplaysgamesExample.createCriteria().andUseridEqualTo(userid).andGameidEqualTo(gameid);
        Userplaysgames userplaysgames = new Userplaysgames();
        userplaysgames.setLastplaytime(new Date());
        if (userplaysgamesDao.selectByExample(userplaysgamesExample).size() > 0) {
            return userplaysgamesDao.updateByExampleSelective(userplaysgames, userplaysgamesExample);
        } else {
            userplaysgames.setGameid(gameid);
            userplaysgames.setUserid(userid);
            return userplaysgamesDao.insertSelective(userplaysgames);
        }
    }

    @Override
    public List<Games> gameAndPosts(int step) {
        return gamesDao.gameAndPosts(step);
    }

    @Override
    public List<Games> hotGames(int step) {
        return gamesDao.hotGames(step);
    }

    @Override
    public Games getGameByGameId(int gameId) {
        return gamesDao.selectByPrimaryKey(gameId);
    }
}
