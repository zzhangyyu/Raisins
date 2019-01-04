package com.yoler.raisins.dao.mapper;

import com.yoler.raisins.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * mybatis-用户Mapper
 */

@Mapper
public interface UserMapper extends BaseMapper<User, Integer> {

    User getUserByName(Map queryMap);

}
