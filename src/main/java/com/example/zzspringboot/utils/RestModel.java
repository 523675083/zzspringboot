package com.example.zzspringboot.utils;

import com.example.zzspringboot.pojo.UserInfo;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class RestModel<T> extends BaseDO {
    private static final long serialVersionUID = 1622330811675955799L;
    private int flag;//是否正常处理
    private String message;    //消息
    private T data;            //传输数据

    public RestModel() {
        this.flag = ResultStatusEnum.SUCCESS.getStatus();
        this.message = ResultStatusEnum.SUCCESS.getMessage();
    }

    public static RestModel<?> ok() {
        RestModel<?> rd = new RestModel<String>();
        rd.setFlag(ResultStatusEnum.SUCCESS.getStatus());
        rd.setMessage(ResultStatusEnum.SUCCESS.getMessage());
        return rd;
    }

    public static RestModel<?> returnMessage(Integer flag, String message) {
        RestModel<?> rd = new RestModel<String>();
        rd.setFlag(flag);
        message = StringUtils.isEmpty(message) ? ResultStatusEnum.getResultMessage(flag) : message;
        rd.setMessage(message);
        return rd;
    }

    public static RestModel<?> error(String message) {
        RestModel<?> rd = new RestModel<String>();
        rd.setFlag(ResultStatusEnum.ERROR.getStatus());
        rd.setMessage(message);
        return rd;
    }

    public static RestModel<?> error() {
        RestModel<?> rd = new RestModel<String>();
        rd.setFlag(ResultStatusEnum.ERROR.getStatus());
        rd.setMessage(ResultStatusEnum.ERROR.getMessage());
        return rd;
    }

    public static <T> RestModel<T> data(T t) {
        RestModel<T> rd = new RestModel<T>();
        rd.setFlag(ResultStatusEnum.SUCCESS.getStatus());
        rd.setMessage(ResultStatusEnum.SUCCESS.getMessage());
        rd.setData(t);
        return rd;
    }

    public static <T> RestModel<T> data(int flag, String message, T t) {
        RestModel<T> rd = new RestModel<T>();
        rd.setFlag(flag);
        message = StringUtils.isEmpty(message) ? ResultStatusEnum.getResultMessage(flag) : message;
        rd.setMessage(message);
        rd.setData(t);
        return rd;
    }

    public static <T> RestModel<?> data(int flag, String message) {
        RestModel<?> rd = new RestModel<String>();
        rd.setFlag(flag);
        message = StringUtils.isEmpty(message) ? ResultStatusEnum.getResultMessage(flag) : message;
        rd.setMessage(message);
        return rd;
    }

    public static RestModel<?> data() {
        RestModel<?> rd = new RestModel<String>();
        rd.setFlag(ResultStatusEnum.SUCCESS.getStatus());
        rd.setMessage(ResultStatusEnum.SUCCESS.getMessage());
        return rd;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<String, Object>();
        UserInfo userInfo=new UserInfo();
        userInfo.setUsername("zz");
        userInfo.setAge(33);
        map.put("user", userInfo);
        System.out.print(RestModel.data(map));
    }
}
