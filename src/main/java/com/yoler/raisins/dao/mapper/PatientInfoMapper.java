package com.yoler.raisins.dao.mapper;

import com.yoler.raisins.entity.PatientInfo;
import com.yoler.raisins.vo.ConsiliaDateIntroVo;
import com.yoler.raisins.vo.ConsiliaNameIntroVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * mybatis-病人基本信息Mapper
 */

@Mapper
public interface PatientInfoMapper extends BaseMapper<PatientInfo, Integer> {
    List<ConsiliaDateIntroVo> getConsiliaDateIntro(Map queryMap);

    List<ConsiliaNameIntroVo> getConsiliaNameIntro(Map queryMap);

    PatientInfo getPatientInfoByName(String patientName);
}
