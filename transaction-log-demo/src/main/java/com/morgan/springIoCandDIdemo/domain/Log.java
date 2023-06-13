package com.morgan.springIoCandDIdemo.domain;

import java.io.Serializable;

public class Log implements Serializable{
     private int id;
    private String info;
    private double createDate;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    public double getCreateDate() {
        return createDate;
    }
    public void setCreateDate(double createDate) {
        this.createDate = createDate;
    }
}
