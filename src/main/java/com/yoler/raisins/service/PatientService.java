package com.yoler.raisins.service;


import com.yoler.raisins.request.*;

import java.util.Map;

public interface PatientService {
    Map<String, Object> getConsiliaDateDir(ConsiliaDateDirReq req);

    Map<String, Object> getConsiliaDateIntro(ConsiliaDateIntroReq req);

    Map<String, Object> getConsiliaNameDir(ConsiliaNameDirReq req);

    Map<String, Object> getConsiliaNameIntro(ConsiliaNameIntroReq req);

    Map<String, Object> getConsiliaDetail(ConsiliaDetailReq req);

    Map<String, Object> getConsiliaIllnessDir(ConsiliaIllnessDirReq req);

    Map<String, Object> getConsiliaPrescriptionDir(ConsiliaPrescriptionDirReq req);
}
