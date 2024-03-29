package com.software.gameforum.dao;

import com.software.gameforum.entity.Posts;
import com.software.gameforum.entity.PostsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PostsDao {
    long countByExample(PostsExample example);

    int deleteByExample(PostsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Posts record);

    int insertSelective(Posts record);

    List<Posts> selectByExample(PostsExample example);

    Posts selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Posts record, @Param("example") PostsExample example);

    int updateByExample(@Param("record") Posts record, @Param("example") PostsExample example);

    int updateByPrimaryKeySelective(Posts record);

    int updateByPrimaryKey(Posts record);

    List<Posts> selectUserFollow(Integer id);

    List<Posts> selectUserPraise(Integer id);

    List<Posts> selectUserComment(Integer id);

    int addPraisenum(Integer postid);

    int subPraisenum(Integer postid);

    int addFollownum(Integer postid);

    int subFollownum(Integer postid);

    int addMessagenum(Integer postid);
}