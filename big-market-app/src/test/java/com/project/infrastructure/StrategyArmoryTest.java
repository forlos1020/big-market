package com.project.infrastructure;

import com.project.domain.strategy.service.armory.IStrategyArmory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Author LSH
 * @Description
 * @Create 2024-11-04
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyArmoryTest {

    @Resource
    private IStrategyArmory strategyArmory;

    @Test
    public void strategyArmoryTest(){
        strategyArmory.assembleLotteryStrategy(100001L);
    }

    @Test
    public void getAssembleRandomVal(){
        log.info("测试结果:{} - 奖品ID值", strategyArmory.getRandomAwardId(100001L));
        log.info("测试结果:{} - 奖品ID值", strategyArmory.getRandomAwardId(100001L));
        log.info("测试结果:{} - 奖品ID值", strategyArmory.getRandomAwardId(100001L));
        log.info("测试结果:{} - 奖品ID值", strategyArmory.getRandomAwardId(100001L));
        log.info("测试结果:{} - 奖品ID值", strategyArmory.getRandomAwardId(100001L));
        log.info("测试结果:{} - 奖品ID值", strategyArmory.getRandomAwardId(100001L));
        log.info("测试结果:{} - 奖品ID值", strategyArmory.getRandomAwardId(100001L));
        log.info("测试结果:{} - 奖品ID值", strategyArmory.getRandomAwardId(100001L));
        log.info("测试结果:{} - 奖品ID值", strategyArmory.getRandomAwardId(100001L));
        log.info("测试结果:{} - 奖品ID值", strategyArmory.getRandomAwardId(100001L));
        log.info("测试结果:{} - 奖品ID值", strategyArmory.getRandomAwardId(100001L));
        log.info("测试结果:{} - 奖品ID值", strategyArmory.getRandomAwardId(100001L));
        log.info("测试结果:{} - 奖品ID值", strategyArmory.getRandomAwardId(100001L));
        log.info("测试结果:{} - 奖品ID值", strategyArmory.getRandomAwardId(100001L));
        log.info("测试结果:{} - 奖品ID值", strategyArmory.getRandomAwardId(100001L));
        log.info("测试结果:{} - 奖品ID值", strategyArmory.getRandomAwardId(100001L));
        log.info("测试结果:{} - 奖品ID值", strategyArmory.getRandomAwardId(100001L));
        log.info("测试结果:{} - 奖品ID值", strategyArmory.getRandomAwardId(100001L));
        log.info("测试结果:{} - 奖品ID值", strategyArmory.getRandomAwardId(100001L));
        log.info("测试结果:{} - 奖品ID值", strategyArmory.getRandomAwardId(100001L));
        log.info("测试结果:{} - 奖品ID值", strategyArmory.getRandomAwardId(100001L));
    }

}
