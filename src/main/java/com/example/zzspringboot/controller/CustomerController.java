package com.example.zzspringboot.controller;

import com.example.zzspringboot.pojo.Customerinfo;
import com.example.zzspringboot.service.CustomerService;
import com.example.zzspringboot.utils.RestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/save")
    public RestModel saveCustomer(){
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");

        Customerinfo customerinfo=new Customerinfo();
        customerinfo.setcName("里斯"+ sdf.format(new Date()));
        customerinfo.setcAddress("北京大兴");
        customerinfo.setcPhone("110120");
        customerinfo.setcNote("boot");
        int i = customerService.saveCustomer(customerinfo);
        return RestModel.data(i);
    }

    @RequestMapping("/update")
    public RestModel updateCustomer(){
        Customerinfo customerinfo=new Customerinfo();
        customerinfo.setcId(3);
        customerinfo.setcName("里斯1");
        customerinfo.setcAddress("北京大兴1");
        //customerinfo.setcPhone("110120");
        //customerinfo.setcNote("boot");
        int i = customerService.updateCustomer(customerinfo);
        return RestModel.data(i);
    }

    @RequestMapping(value = "/delete/{id}")
    public RestModel deleteCustomer(@PathVariable(value = "id")Integer id){
        int i = customerService.deleteCustomer(id);
        return RestModel.data(i);
    }

    @RequestMapping(value = "/select/{id}")
    public RestModel selectCustomer(@PathVariable(value = "id")Integer id){
        return RestModel.data(customerService.queryCustomerById(id));
    }

    @RequestMapping(value = "/selectList/{name}")
    public RestModel selectCustomerList(@PathVariable(value = "name")String name){
         Customerinfo customerinfo=new Customerinfo();
         customerinfo.setcName(name);
        return RestModel.data(customerService.queryCustomerList(customerinfo));
    }

    @RequestMapping(value = "/selectListPaged/{name}/{page}")
    public RestModel selectCustomerListPaged(@PathVariable(value = "name")String name,
                                             @PathVariable(value="page") Integer page){
        Customerinfo customerinfo=new Customerinfo();
        customerinfo.setcName(name);
        if(page==null){
            page=1;
        }
        int pageSize=10;
        return RestModel.data(customerService.queryCustomerListPaged(customerinfo,page,pageSize));
    }

    @RequestMapping(value = "/selectListCount/{name}")
    public RestModel selectListCount(@PathVariable(value = "name")String name){
        Customerinfo customerinfo=new Customerinfo();
        customerinfo.setcName(name);
        return RestModel.data(customerService.queryCustomerListCount(customerinfo));
    }

    @RequestMapping(value = "/selectById/{id}")
    public RestModel selectById(@PathVariable(value = "id")Integer id){
        return RestModel.data(customerService.getCustomerinfoById(id));
    }
}
