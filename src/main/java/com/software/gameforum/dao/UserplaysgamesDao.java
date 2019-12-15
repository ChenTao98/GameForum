package com.software.gameforum.dao;

import com.software.gameforum.entity.Userplaysgames;
import com.software.gameforum.entity.UserplaysgamesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserplaysgamesDao {
    long countByExample(UserplaysgamesExample example);

    int deleteByExample(UserplaysgamesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Userplaysgames record);

    int insertSelective(Userplaysgames record);

    List<Userplaysgames> selectByExample(UserplaysgamesExample example);

    Userplaysgames selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Userplaysgames record, @Param("example") UserplaysgamesExample example);

    int updateByExample(@Param("record") Userplaysgames record, @Param("example") UserplaysgamesExample example);

    int updateByPrimaryKeySelective(Userplaysgames record);

    int updateByPrimaryKey(Userplaysgames record);
}