package com.software.gameforum.dao;

import com.software.gameforum.entity.Usersendposts;
import com.software.gameforum.entity.UsersendpostsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersendpostsDao {
    long countByExample(UsersendpostsExample example);

    int deleteByExample(UsersendpostsExample example);

    int insert(Usersendposts record);

    int insertSelective(Usersendposts record);

    List<Usersendposts> selectByExample(UsersendpostsExample example);

    int updateByExampleSelective(@Param("record") Usersendposts record, @Param("example") UsersendpostsExample example);

    int updateByExample(@Param("record") Usersendposts record, @Param("example") UsersendpostsExample example);
}