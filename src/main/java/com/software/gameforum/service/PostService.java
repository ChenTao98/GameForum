package com.software.gameforum.service;

import com.software.gameforum.entity.*;

import java.util.List;

public interface PostService {
    int addPost(Posts posts);

    List<Posts> getUserPublishedPosts(int userId);

    List<Posts> getUserFollowPosts(int userId);

    List<Posts> getUserPraisePosts(int userId);

    List<Posts> getUserCommentPosts(int userId);

    List<Posts> getPostByGameId(int gameId, int step);

    int praisePost(int postId, int userId);

    int cancelPraisePost(int postId, int userId);

    int followPost(int postId, int userId);

    int cancelFollowPost(int postId, int userId);

    List<Posts> searchPost(String searchKey);

    Posts getPostByPostid(int postid);

    Userfollowposts getFollowByPostIdAndUserId(int postId, int userId);

    Userpraiseposts getPraiseByPostIdAndUserId(int postId, int userId);

    int commentPost(Message message);

    int replyMessage(Reply reply);

    List<Message> getMessageByPostId(int postId);

    List<Message> getMessageByUserId(int userId);

    List<Reply> getReplyByMessageId(int messageId);
}
