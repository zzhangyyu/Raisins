package com.yoler.raisins.request;

public class ConsiliaIllnessDirReqContent {
    private String pageIdx;
    private String recordPerPage;
    private String illnessLike;

    public String getPageIdx() {
        return pageIdx;
    }

    public void setPageIdx(String pageIdx) {
        this.pageIdx = pageIdx;
    }

    public String getRecordPerPage() {
        return recordPerPage;
    }

    public void setRecordPerPage(String recordPerPage) {
        this.recordPerPage = recordPerPage;
    }

    public String getIllnessLike() {
        return illnessLike;
    }

    public void setIllnessLike(String illnessLike) {
        this.illnessLike = illnessLike;
    }
}
