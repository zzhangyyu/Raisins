package com.yoler.raisins.request;

public class SignUpReq extends BaseReq {
    private SignUpReqContent content;

    public SignUpReqContent getContent() {
        return content;
    }

    public void setContent(SignUpReqContent content) {
        this.content = content;
    }
}
