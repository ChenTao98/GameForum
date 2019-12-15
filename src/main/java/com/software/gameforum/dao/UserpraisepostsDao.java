package com.software.gameforum.dao;

import com.software.gameforum.entity.Userpraiseposts;
import com.software.gameforum.entity.UserpraisepostsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserpraisepostsDao {
    long countByExample(UserpraisepostsExample example);

    int deleteByExample(UserpraisepostsExample example);

    int insert(Userpraiseposts record);

    int insertSelective(Userpraiseposts record);

    List<Userpraiseposts> selectByExample(UserpraisepostsExample example);

    int updateByExampleSelective(@Param("record") Userpraiseposts record, @Param("example") UserpraisepostsExample example);

    int updateByExample(@Param("record") Userpraiseposts record, @Param("example") UserpraisepostsExample example);
}