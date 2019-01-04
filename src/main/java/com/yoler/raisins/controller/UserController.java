package com.yoler.raisins.controller;

import com.yoler.raisins.request.SignInReq;
import com.yoler.raisins.request.SignUpReq;
import com.yoler.raisins.request.UserFavouritePatientReq;
import com.yoler.raisins.service.UserService;
import com.yoler.raisins.util.GsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 用户controller
 */
@RestController
@RequestMapping(value = "/user/")
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    UserService userService;

    @RequestMapping(value = "signIn", method = RequestMethod.POST)
    public String signIn(@RequestBody String reqJson) {
        logger.debug("signIn req is :" + reqJson);
        SignInReq req = GsonUtil.jsonToObject(reqJson, SignInReq.class);
        Map<String, Object> resultMap = userService.signIn(req);
        String result = GsonUtil.objectToJson(resultMap);
        logger.debug("signIn resp is :" + result);
        return result;
    }

    @RequestMapping(value = "signUp", method = RequestMethod.POST)
    public String signUp(@RequestBody String reqJson) {
        logger.debug("signUp req is :" + reqJson);
        SignUpReq req = GsonUtil.jsonToObject(reqJson, SignUpReq.class);
        Map<String, Object> resultMap = userService.signUp(req);
        String result = GsonUtil.objectToJson(resultMap);
        logger.debug("signUp resp is :" + result);
        return result;
    }

    @RequestMapping(value = "getUserFavouritePatient", method = RequestMethod.POST)
    public String getUserFavouritePatient(@RequestBody String reqJson) {
        logger.debug("getUserFavouritePatient req is :" + reqJson);
        UserFavouritePatientReq req = GsonUtil.jsonToObject(reqJson, UserFavouritePatientReq.class);
        Map<String, Object> resultMap = userService.getUserFavouritePatient(req);
        String result = GsonUtil.objectToJson(resultMap);
        logger.debug("getUserFavouritePatient resp is :" + result);
        return result;
    }

}
