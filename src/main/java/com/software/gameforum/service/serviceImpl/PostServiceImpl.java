package com.software.gameforum.service.serviceImpl;

import com.software.gameforum.dao.GamesDao;
import com.software.gameforum.dao.PostsDao;
import com.software.gameforum.entity.Posts;
import com.software.gameforum.entity.PostsExample;
import com.software.gameforum.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostsDao postsDao;
    @Autowired
    private GamesDao gamesDao;

    @Override
    @Transactional
    public int addPost(Posts posts) {
        int result = gamesDao.addPostnum(posts.getGameid());
        if (result == 0) {
            return 0;
        }
        return postsDao.insertSelective(posts);
    }

    @Override
    public List<Posts> getUserPublishedPosts(int userId) {
        PostsExample postsExample = new PostsExample();
        postsExample.createCriteria().andUseridEqualTo(userId);
        postsExample.setOrderByClause("time desc");
        return postsDao.selectByExample(postsExample);
    }

    @Override
    public List<Posts> getUserFollowPosts(int userId) {
        return postsDao.selectUserFollow(userId);
    }

    @Override
    public List<Posts> getUserPraisePosts(int userId) {
        return postsDao.selectUserPraise(userId);
    }

    @Override
    public List<Posts> getPostByGameId(int gameId,int step) {
        PostsExample postsExample=new PostsExample();
        postsExample.createCriteria().andGameidEqualTo(gameId);
        postsExample.setLimit(step);
        postsExample.setOrderByClause("time desc");
        return postsDao.selectByExample(postsExample);
    }

}
