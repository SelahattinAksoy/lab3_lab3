package com.example.selah.lab3_lab3;

public class Hayvan {

    private String type;
    private int picId;

    public Hayvan(String type,int picId){
        this.type=type;
        this.picId=picId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPicId() {
        return picId;
    }

    public void setPicId(int picId) {
        this.picId = picId;
    }
}
