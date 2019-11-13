package com.chainup.common.exchange.entity;

import java.util.Date;

public class Beinvited {
    private Integer id;

    private String uid;

    private String byid;

    private Date bytime;

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

    public String getByid() {
        return byid;
    }

    public void setByid(String byid) {
        this.byid = byid == null ? null : byid.trim();
    }

    public Date getBytime() {
        return bytime;
    }

    public void setBytime(Date bytime) {
        this.bytime = bytime;
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