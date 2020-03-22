package com.lxy.newsshow.entities;

import javax.xml.crypto.Data;
import java.util.Date;

public class OperationHistory {
    Integer operationID;
    long userid;
    int articleid;
    int operation;
    String time;
    public OperationHistory(long userid, int articleid, int operation, String time){
        this.userid = userid;
        this.articleid = articleid;
        this.operation = operation;
        this.time = time;
    }
    public Integer getOperationID() {
        return operationID;
    }

    public void setOperationID(Integer operationID) {
        this.operationID = operationID;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getArticleid() {
        return articleid;
    }

    public void setArticleid(int articleid) {
        this.articleid = articleid;
    }

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
