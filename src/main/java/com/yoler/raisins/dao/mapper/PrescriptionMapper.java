package com.yoler.raisins.dao.mapper;

import com.yoler.raisins.entity.Prescription;
import org.apache.ibatis.annotations.Mapper;

/**
 * mybatis-药方Mapper
 */

@Mapper
public interface PrescriptionMapper extends BaseMapper<Prescription, Integer> {

}
