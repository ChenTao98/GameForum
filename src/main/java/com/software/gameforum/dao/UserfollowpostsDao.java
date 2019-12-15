package com.software.gameforum.dao;

import com.software.gameforum.entity.Userfollowposts;
import com.software.gameforum.entity.UserfollowpostsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserfollowpostsDao {
    long countByExample(UserfollowpostsExample example);

    int deleteByExample(UserfollowpostsExample example);

    int insert(Userfollowposts record);

    int insertSelective(Userfollowposts record);

    List<Userfollowposts> selectByExample(UserfollowpostsExample example);

    int updateByExampleSelective(@Param("record") Userfollowposts record, @Param("example") UserfollowpostsExample example);

    int updateByExample(@Param("record") Userfollowposts record, @Param("example") UserfollowpostsExample example);
}