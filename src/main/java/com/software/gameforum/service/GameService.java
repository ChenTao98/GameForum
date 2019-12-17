package com.software.gameforum.service;

import com.software.gameforum.entity.Games;

import java.util.List;

public interface GameService {
    List<Games> userPlayed(int userId);

    List<Games> userFollow(int userId);

    int addGamePlayed(int userid, int gameid);

    List<Games> gameAndPosts(int step);

    List<Games> hotGames(int step);

    Games getGameByGameId(int gameId);
}
