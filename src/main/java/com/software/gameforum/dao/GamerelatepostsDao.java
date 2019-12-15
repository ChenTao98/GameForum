package com.software.gameforum.dao;

import com.software.gameforum.entity.Gamerelateposts;
import com.software.gameforum.entity.GamerelatepostsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GamerelatepostsDao {
    long countByExample(GamerelatepostsExample example);

    int deleteByExample(GamerelatepostsExample example);

    int insert(Gamerelateposts record);

    int insertSelective(Gamerelateposts record);

    List<Gamerelateposts> selectByExample(GamerelatepostsExample example);

    int updateByExampleSelective(@Param("record") Gamerelateposts record, @Param("example") GamerelatepostsExample example);

    int updateByExample(@Param("record") Gamerelateposts record, @Param("example") GamerelatepostsExample example);
}