package com.example.zzspringboot.service.impl;

import com.example.zzspringboot.mapper.CustomerinfoMapper;
import com.example.zzspringboot.mapper.CustomerinfoMapperCustomer;
import com.example.zzspringboot.pojo.Customerinfo;
import com.example.zzspringboot.service.CustomerService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerinfoMapper customerinfoMapper;

    @Autowired
    private CustomerinfoMapperCustomer customerinfoMapperCustomer;

    @Override
    public int saveCustomer(Customerinfo customerinfo) {
       return customerinfoMapper.insert(customerinfo);
    }

    @Override
    public int updateCustomer(Customerinfo customerinfo) {
       return customerinfoMapper.updateByPrimaryKeySelective(customerinfo);
    }

    @Override
    public int deleteCustomer(Integer id) {
       return customerinfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Customerinfo queryCustomerById(Integer id) {
        return customerinfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Customerinfo> queryCustomerList(Customerinfo customerinfo) {
        Example example = new Example(Customerinfo.class);
        Example.Criteria criteria=example.createCriteria();
        if(!StringUtils.isEmpty(customerinfo.getcName())){
            criteria.andLike("cName", "%" + customerinfo.getcName() + "%");
        }

        return customerinfoMapper.selectByExample(example);
    }

    @Override
    public List<Customerinfo> queryCustomerListPaged(Customerinfo customerinfo, int page, int pageSize) {
        PageHelper.startPage(page,pageSize);
        Example example = new Example(Customerinfo.class);
        Example.Criteria criteria=example.createCriteria();
        if(!StringUtils.isEmpty(customerinfo.getcName())){
            criteria.andLike("cName", "%" + customerinfo.getcName() + "%");
        }
        return customerinfoMapper.selectByExample(example);
    }

    @Override
    public int queryCustomerListCount(Customerinfo customerinfo) {
        Example example = new Example(Customerinfo.class);
        Example.Criteria criteria=example.createCriteria();
        if(!StringUtils.isEmpty(customerinfo.getcName())){
            criteria.andLike("cName", "%" + customerinfo.getcName() + "%");
        }
        return customerinfoMapper.selectCountByExample(example);
    }

    @Override
    public Customerinfo getCustomerinfoById(Integer id) {
        return customerinfoMapperCustomer.getCustomerinfoById(id);
    }
}
