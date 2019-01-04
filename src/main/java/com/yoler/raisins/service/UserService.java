package com.yoler.raisins.service;

import com.yoler.raisins.request.SignInReq;
import com.yoler.raisins.request.SignUpReq;
import com.yoler.raisins.request.UserFavouritePatientReq;

import java.util.Map;

public interface UserService {
    /**
     * mobile用户注册
     *
     * @param req
     * @return
     */
    Map<String, Object> signUp(SignUpReq req);

    /**
     * mobile用户登录
     *
     * @param req
     * @return
     */
    Map<String, Object> signIn(SignInReq req);

    /**
     * 获取mobile用户收藏病历
     *
     * @param req
     * @return
     */
    Map<String, Object> getUserFavouritePatient(UserFavouritePatientReq req);

}
