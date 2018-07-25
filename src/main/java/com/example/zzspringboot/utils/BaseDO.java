package com.example.zzspringboot.utils;

import java.io.Serializable;

public abstract class BaseDO implements Serializable {


    private int flag;//业务标识符

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String toString() {
        try {
            return JsonObjectUtils.ObjectToString(this);
        } catch (Exception e) {
            return super.toString();
        }
    }
}