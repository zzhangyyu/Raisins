package com.yoler.raisins.request;

public class UserFavouritePatientReq extends BaseReq {

    private UserFavouritePatientReqContent content;

    public UserFavouritePatientReqContent getContent() {
        return content;
    }

    public void setContent(UserFavouritePatientReqContent content) {
        this.content = content;
    }
}
