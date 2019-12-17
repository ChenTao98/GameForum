package com.software.gameforum.service.serviceImpl;

import com.software.gameforum.dao.*;
import com.software.gameforum.entity.*;
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
    @Autowired
    private UserpraisepostsDao userpraisepostsDao;
    @Autowired
    private UserfollowpostsDao userfollowpostsDao;
    @Autowired
    private MessageDao messageDao;
    @Autowired
    private ReplyDao replyDao;

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
    public List<Posts> getUserCommentPosts(int userId) {
        return postsDao.selectUserComment(userId);
    }

    @Override
    public List<Posts> getPostByGameId(int gameId, int step) {
        PostsExample postsExample = new PostsExample();
        postsExample.createCriteria().andGameidEqualTo(gameId);
        postsExample.setLimit(step);
        postsExample.setOrderByClause("time desc");
        return postsDao.selectByExample(postsExample);
    }

    @Override
    @Transactional
    public int praisePost(int postId, int userId) {
        UserpraisepostsExample example = new UserpraisepostsExample();
        example.createCriteria().andPostidEqualTo(postId).andUseridEqualTo(userId);
        List<Userpraiseposts> list = userpraisepostsDao.selectByExample(example);
        if (list.size() != 0) {
            return -1;
        }
        Userpraiseposts userpraiseposts = new Userpraiseposts();
        userpraiseposts.setPostid(postId);
        userpraiseposts.setUserid(userId);
        userpraisepostsDao.insert(userpraiseposts);
        postsDao.addPraisenum(postId);
        return 1;
    }

    @Override
    @Transactional
    public int cancelPraisePost(int postId, int userId) {
        UserpraisepostsExample example = new UserpraisepostsExample();
        example.createCriteria().andPostidEqualTo(postId).andUseridEqualTo(userId);
        List<Userpraiseposts> list = userpraisepostsDao.selectByExample(example);
        if (list.size() == 0) {
            return -1;
        }
        userpraisepostsDao.deleteByExample(example);
        postsDao.subPraisenum(postId);
        return 1;
    }

    @Override
    @Transactional
    public int followPost(int postId, int userId) {
        UserfollowpostsExample example = new UserfollowpostsExample();
        example.createCriteria().andPostidEqualTo(postId).andUseridEqualTo(userId);
        List<Userfollowposts> list = userfollowpostsDao.selectByExample(example);
        if (list.size() != 0) {
            return -1;
        }
        Userfollowposts userfollowposts = new Userfollowposts();
        userfollowposts.setPostid(postId);
        userfollowposts.setUserid(userId);
        userfollowpostsDao.insert(userfollowposts);
        postsDao.addFollownum(postId);
        return 1;
    }

    @Override
    @Transactional
    public int cancelFollowPost(int postId, int userId) {
        UserfollowpostsExample example = new UserfollowpostsExample();
        example.createCriteria().andPostidEqualTo(postId).andUseridEqualTo(userId);
        List<Userfollowposts> list = userfollowpostsDao.selectByExample(example);
        if (list.size() == 0) {
            return -1;
        }
        userfollowpostsDao.deleteByExample(example);
        postsDao.subFollownum(postId);
        return 1;
    }

    @Override
    public List<Posts> searchPost(String searchKey) {
        PostsExample postsExample = new PostsExample();
        postsExample.createCriteria().andTopicLike("%" + searchKey + "%");
        postsExample.or().andContentLike("%" + searchKey + "%");
        return postsDao.selectByExample(postsExample);
    }

    @Override
    public Posts getPostByPostid(int postid) {
        return postsDao.selectByPrimaryKey(postid);
    }

    @Override
    public Userfollowposts getFollowByPostIdAndUserId(int postId, int userId) {
        UserfollowpostsExample example = new UserfollowpostsExample();
        example.createCriteria().andPostidEqualTo(postId).andUseridEqualTo(userId);
        List<Userfollowposts> list = userfollowpostsDao.selectByExample(example);
        return list.size() == 0 ? null : list.get(0);
    }

    @Override
    public Userpraiseposts getPraiseByPostIdAndUserId(int postId, int userId) {
        UserpraisepostsExample example = new UserpraisepostsExample();
        example.createCriteria().andPostidEqualTo(postId).andUseridEqualTo(userId);
        List<Userpraiseposts> list = userpraisepostsDao.selectByExample(example);
        return list.size() == 0 ? null : list.get(0);
    }

    @Override
    @Transactional
    public int commentPost(Message message) {
        postsDao.addMessagenum(message.getPostid());
        return messageDao.insertSelective(message);
    }

    @Override
    public int replyMessage(Reply reply) {
        return replyDao.insertSelective(reply);
    }

    @Override
    public List<Message> getMessageByPostId(int postId) {
        return messageDao.selectByPostId(postId);
    }

    @Override
    public List<Message> getMessageByUserId(int userId) {
        return messageDao.selectByUserId(userId);
    }

    @Override
    public List<Reply> getReplyByMessageId(int messageId) {
        return replyDao.selectByMessageId(messageId);
    }
}
