package com.chainup.exchange.dao;

import com.chainup.common.exchange.entity.Subscription;
import com.chainup.common.exchange.entity.SubscriptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubscriptionMapper {
    int countByExample(SubscriptionExample example);

    int deleteByExample(SubscriptionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Subscription record);

    int insertSelective(Subscription record);

    List<Subscription> selectByExample(SubscriptionExample example);

    Subscription selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Subscription record, @Param("example") SubscriptionExample example);

    int updateByExample(@Param("record") Subscription record, @Param("example") SubscriptionExample example);

    int updateByPrimaryKeySelective(Subscription record);

    int updateByPrimaryKey(Subscription record);
}