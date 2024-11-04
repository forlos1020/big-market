package com.project.infrastructure.persistent.mapper;

import com.project.infrastructure.persistent.po.StrategyRule;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Fuzhengwei bugstack.cn @小傅哥
 * @description 策略规则
 * @create 2023-12-16 13:25
 */
@Mapper
public interface IStrategyRuleMapper {

    List<StrategyRule> queryStrategyRuleList();

}
