package com.yoler.raisins.dao.mapper;

import com.yoler.raisins.entity.PatientCondition;
import com.yoler.raisins.vo.ConsiliaDateDirVo;
import com.yoler.raisins.vo.ConsiliaDetailVo;
import com.yoler.raisins.vo.ConsiliaNameDirVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * mybatis-病历Mapper
 */

@Mapper
public interface PatientConditionMapper extends BaseMapper<PatientCondition, Integer> {
    List<ConsiliaDateDirVo> getConsiliaDateDir(Map<String, Object> queryMap);

    List<ConsiliaNameDirVo> getConsiliaNameDir(Map<String, Object> queryMap);

    ConsiliaDetailVo getConsiliaDetail(Map queryMap);

}
