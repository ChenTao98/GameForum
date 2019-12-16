package com.software.gameforum.service;

import com.software.gameforum.entity.Posts;

import java.util.List;

public interface PostService {
    int addPost(Posts posts);

    List<Posts> getUserPublishedPosts(int userId);

    List<Posts> getUserFollowPosts(int userId);
}
