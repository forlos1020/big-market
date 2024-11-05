package com.project.infrastructure.persistent.mapper;

import com.project.infrastructure.persistent.po.Strategy;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Fuzhengwei bugstack.cn @小傅哥
 * @description 抽奖策略
 * @create 2023-12-16 13:24
 */
@Mapper
public interface IStrategyMapper {

    List<Strategy> queryStrategyList();

    Strategy queryStrategyByStrategyId(@Param("strategyId") Long strategyId);
}
