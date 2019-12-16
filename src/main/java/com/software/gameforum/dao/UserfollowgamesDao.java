package com.software.gameforum.dao;

import com.software.gameforum.entity.Userfollowgames;
import com.software.gameforum.entity.UserfollowgamesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserfollowgamesDao {
    long countByExample(UserfollowgamesExample example);

    int deleteByExample(UserfollowgamesExample example);

    int insert(Userfollowgames record);

    int insertSelective(Userfollowgames record);

    List<Userfollowgames> selectByExample(UserfollowgamesExample example);

    int updateByExampleSelective(@Param("record") Userfollowgames record, @Param("example") UserfollowgamesExample example);

    int updateByExample(@Param("record") Userfollowgames record, @Param("example") UserfollowgamesExample example);
}