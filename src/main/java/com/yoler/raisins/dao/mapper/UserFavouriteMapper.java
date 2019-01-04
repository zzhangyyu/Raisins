package com.yoler.raisins.dao.mapper;

import com.yoler.raisins.vo.UserFavouritePatientVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * mybatis-用户收藏Mapper
 */

@Mapper
public interface UserFavouriteMapper {

    List<UserFavouritePatientVo> getUserFavouritePatient(Map queryMap);

}
