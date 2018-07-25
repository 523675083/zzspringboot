package com.example.zzspringboot.pojo;

import javax.persistence.*;

public class Customerinfo {
    /**
     * 客户编号
     */
    @Id
    @Column(name = "c_id")
    private Integer cId;

    /**
     * 客户姓名
     */
    @Column(name = "c_name")
    private String cName;

    /**
     * 联系电话
     */
    @Column(name = "c_phone")
    private String cPhone;

    /**
     * 地址
     */
    @Column(name = "c_address")
    private String cAddress;

    /**
     * 备注
     */
    @Column(name = "c_note")
    private String cNote;

    /**
     * 获取客户编号
     *
     * @return c_id - 客户编号
     */
    public Integer getcId() {
        return cId;
    }

    /**
     * 设置客户编号
     *
     * @param cId 客户编号
     */
    public void setcId(Integer cId) {
        this.cId = cId;
    }

    /**
     * 获取客户姓名
     *
     * @return c_name - 客户姓名
     */
    public String getcName() {
        return cName;
    }

    /**
     * 设置客户姓名
     *
     * @param cName 客户姓名
     */
    public void setcName(String cName) {
        this.cName = cName;
    }

    /**
     * 获取联系电话
     *
     * @return c_phone - 联系电话
     */
    public String getcPhone() {
        return cPhone;
    }

    /**
     * 设置联系电话
     *
     * @param cPhone 联系电话
     */
    public void setcPhone(String cPhone) {
        this.cPhone = cPhone;
    }

    /**
     * 获取地址
     *
     * @return c_address - 地址
     */
    public String getcAddress() {
        return cAddress;
    }

    /**
     * 设置地址
     *
     * @param cAddress 地址
     */
    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    /**
     * 获取备注
     *
     * @return c_note - 备注
     */
    public String getcNote() {
        return cNote;
    }

    /**
     * 设置备注
     *
     * @param cNote 备注
     */
    public void setcNote(String cNote) {
        this.cNote = cNote;
    }
}