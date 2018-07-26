package com.example.zzspringboot.service;

import com.example.zzspringboot.pojo.Customerinfo;

import java.util.List;

public interface CustomerService {

    public int saveCustomer(Customerinfo customerinfo);

    public int updateCustomer(Customerinfo customerinfo);

    public int deleteCustomer(Integer id);

    public Customerinfo queryCustomerById(Integer id);

    public List<Customerinfo> queryCustomerList(Customerinfo customerinfo);

    List<Customerinfo> queryCustomerListPaged(Customerinfo customerinfo,int page,int pageSize);

    int queryCustomerListCount(Customerinfo customerinfo);

    Customerinfo getCustomerinfoById(Integer id);

}
