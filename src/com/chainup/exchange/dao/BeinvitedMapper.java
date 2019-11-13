package com.chainup.exchange.dao;

import com.chainup.common.exchange.entity.Beinvited;
import com.chainup.common.exchange.entity.BeinvitedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BeinvitedMapper {
    int countByExample(BeinvitedExample example);

    int deleteByExample(BeinvitedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Beinvited record);

    int insertSelective(Beinvited record);

    List<Beinvited> selectByExample(BeinvitedExample example);

    Beinvited selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Beinvited record, @Param("example") BeinvitedExample example);

    int updateByExample(@Param("record") Beinvited record, @Param("example") BeinvitedExample example);

    int updateByPrimaryKeySelective(Beinvited record);

    int updateByPrimaryKey(Beinvited record);
}