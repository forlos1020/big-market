package com.project.domain.strategy.service.armory;

/**
 * @Author LSH
 * @Description 策略装配库（兵工厂），初始化策略计算
 * @Create 2024-11-04
 */
public interface IStrategyArmory {

    boolean assembleLotteryStrategy(Long strategyId);

}
