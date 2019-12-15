package com.software.gameforum.dao;

import com.software.gameforum.entity.Userpraisemsg;
import com.software.gameforum.entity.UserpraisemsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserpraisemsgDao {
    long countByExample(UserpraisemsgExample example);

    int deleteByExample(UserpraisemsgExample example);

    int insert(Userpraisemsg record);

    int insertSelective(Userpraisemsg record);

    List<Userpraisemsg> selectByExample(UserpraisemsgExample example);

    int updateByExampleSelective(@Param("record") Userpraisemsg record, @Param("example") UserpraisemsgExample example);

    int updateByExample(@Param("record") Userpraisemsg record, @Param("example") UserpraisemsgExample example);
}