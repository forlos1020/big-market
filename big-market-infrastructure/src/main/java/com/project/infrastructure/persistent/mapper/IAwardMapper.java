package com.project.infrastructure.persistent.mapper;

import com.project.infrastructure.persistent.po.Award;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Fuzhengwei bugstack.cn @小傅哥
 * @description 奖品表
 * @create 2023-12-16 13:23
 */
@Mapper
public interface IAwardMapper {

    List<Award> queryAwardList();

}
