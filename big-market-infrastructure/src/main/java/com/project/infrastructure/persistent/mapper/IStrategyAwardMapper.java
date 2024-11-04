package com.project.infrastructure.persistent.mapper;

import com.project.infrastructure.persistent.po.StrategyAward;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Fuzhengwei bugstack.cn @小傅哥
 * @description 抽奖策略奖品明细配置 - 概率、规则
 * @create 2023-12-16 13:24
 */
@Mapper
public interface IStrategyAwardMapper {

    List<StrategyAward> queryStrategyAwardList();

}
