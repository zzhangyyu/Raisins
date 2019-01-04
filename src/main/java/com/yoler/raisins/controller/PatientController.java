package com.yoler.raisins.controller;

import com.yoler.raisins.request.*;
import com.yoler.raisins.service.PatientService;
import com.yoler.raisins.util.GsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 病历controller
 */
@RestController
@RequestMapping(value = "/patient")
public class PatientController {


    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    PatientService patientService;

    @RequestMapping(value = "getConsiliaDateDir", method = RequestMethod.POST)
    public String getConsiliaDateDir(@RequestBody String reqJson) {
        logger.debug("getConsiliaDateDir req is :" + reqJson);
        ConsiliaDateDirReq req = GsonUtil.jsonToObject(reqJson, ConsiliaDateDirReq.class);
        Map<String, Object> resultMap = patientService.getConsiliaDateDir(req);
        String result = GsonUtil.objectToJson(resultMap);
        logger.debug("getConsiliaDateDir resp is :" + result);
        return result;
    }

    @RequestMapping(value = "getConsiliaDateIntro", method = RequestMethod.POST)
    public String getConsiliaDateIntro(@RequestBody String reqJson) {
        logger.debug("getConsiliaDateIntro req is :" + reqJson);
        ConsiliaDateIntroReq req = GsonUtil.jsonToObject(reqJson, ConsiliaDateIntroReq.class);
        Map<String, Object> resultMap = patientService.getConsiliaDateIntro(req);
        String result = GsonUtil.objectToJson(resultMap);
        logger.debug("getConsiliaDateIntro resp is :" + result);
        return result;
    }

    @RequestMapping(value = "getConsiliaNameDir", method = RequestMethod.POST)
    public String getConsiliaNameDir(@RequestBody String reqJson) {
        logger.debug("getConsiliaNameDir req is :" + reqJson);
        ConsiliaNameDirReq req = GsonUtil.jsonToObject(reqJson, ConsiliaNameDirReq.class);
        Map<String, Object> resultMap = patientService.getConsiliaNameDir(req);
        String result = GsonUtil.objectToJson(resultMap);
        logger.debug("getConsiliaNameDir resp is :" + result);
        return result;
    }

    @RequestMapping(value = "getConsiliaNameIntro", method = RequestMethod.POST)
    public String getConsiliaNameIntro(@RequestBody String reqJson) {
        logger.debug("getConsiliaNameIntro req is :" + reqJson);
        ConsiliaNameIntroReq req = GsonUtil.jsonToObject(reqJson, ConsiliaNameIntroReq.class);
        Map<String, Object> resultMap = patientService.getConsiliaNameIntro(req);
        String result = GsonUtil.objectToJson(resultMap);
        logger.debug("getConsiliaNameIntro resp is :" + result);
        return result;
    }

    @RequestMapping(value = "getConsiliaDetail", method = RequestMethod.POST)
    public String getConsiliaDetail(@RequestBody String reqJson) {
        logger.debug("getConsiliaDetail req is :" + reqJson);
        ConsiliaDetailReq req = GsonUtil.jsonToObject(reqJson, ConsiliaDetailReq.class);
        Map<String, Object> resultMap = patientService.getConsiliaDetail(req);
        String result = GsonUtil.objectToJson(resultMap);
        logger.debug("getConsiliaDetail resp is :" + result);
        return result;
    }


}
