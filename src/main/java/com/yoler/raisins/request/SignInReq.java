package com.yoler.raisins.request;

public class SignInReq extends BaseReq {
    private SignInReqContent content;

    public SignInReqContent getContent() {
        return content;
    }

    public void setContent(SignInReqContent content) {
        this.content = content;
    }
}
