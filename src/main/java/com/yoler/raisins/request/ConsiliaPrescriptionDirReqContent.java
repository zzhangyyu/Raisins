package com.yoler.raisins.request;

public class ConsiliaPrescriptionDirReqContent {
    private String pageIdx;
    private String recordPerPage;
    private String prescriptionLike;

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

    public String getPrescriptionLike() {
        return prescriptionLike;
    }

    public void setPrescriptionLike(String prescriptionLike) {
        this.prescriptionLike = prescriptionLike;
    }
}
