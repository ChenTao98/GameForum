package com.software.gameforum.dao;

import com.software.gameforum.entity.Games;
import com.software.gameforum.entity.GamesExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GamesDao {
    long countByExample(GamesExample example);

    int deleteByExample(GamesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Games record);

    int insertSelective(Games record);

    List<Games> selectByExample(GamesExample example);

    Games selectByPrimaryKey(Integer id);

    List<Games> selectByFollow(Integer id);

    List<Games> selectByPlay(Integer id);

    int updateByExampleSelective(@Param("record") Games record, @Param("example") GamesExample example);

    int updateByExample(@Param("record") Games record, @Param("example") GamesExample example);

    int updateByPrimaryKeySelective(Games record);

    int updateByPrimaryKey(Games record);

    int addPostnum(Integer gameid);

    List<Games> gameAndPosts(Integer step);
}