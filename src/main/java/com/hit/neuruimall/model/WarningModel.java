package com.hit.neuruimall.model;

import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("warning")
public class WarningModel {

    private int warningId;
    private String warningInfo;
    private Date warningDate;

    public int getWarningId() {
        return warningId;
    }

    public void setWarningId(int warningId) {
        this.warningId = warningId;
    }

    public String getWarningInfo() {
        return warningInfo;
    }

    public void setWarningInfo(String warningInfo) {
        this.warningInfo = warningInfo;
    }

    public Date getWarningDate() {
        return warningDate;
    }

    public void setWarningDate(Date warningDate) {
        this.warningDate = warningDate;
    }

    @Override
    public String toString() {
        return "WarningModel{" +
                "warningId=" + warningId +
                ", warningInfo='" + warningInfo + '\'' +
                ", warningDate=" + warningDate +
                '}';
    }
}
