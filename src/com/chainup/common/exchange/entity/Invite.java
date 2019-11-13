package com.chainup.common.exchange.entity;

import java.util.Date;

public class Invite {
    private Integer id;

    private String uid;

    private String yid;

    private Date ytime;

    private Integer status;

    private Integer sid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getYid() {
        return yid;
    }

    public void setYid(String yid) {
        this.yid = yid == null ? null : yid.trim();
    }

    public Date getYtime() {
        return ytime;
    }

    public void setYtime(Date ytime) {
        this.ytime = ytime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
}