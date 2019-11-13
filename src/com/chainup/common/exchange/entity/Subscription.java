package com.chainup.common.exchange.entity;

import java.util.Date;

public class Subscription {
    private Integer id;

    private String uid;

    private Integer amount;

    private Date stime;

    private Integer usdtnum;

    private Integer vfbtfnum;

    private Integer status;

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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }

    public Integer getUsdtnum() {
        return usdtnum;
    }

    public void setUsdtnum(Integer usdtnum) {
        this.usdtnum = usdtnum;
    }

    public Integer getVfbtfnum() {
        return vfbtfnum;
    }

    public void setVfbtfnum(Integer vfbtfnum) {
        this.vfbtfnum = vfbtfnum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}