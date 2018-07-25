package com.example.zzspringboot.utils;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: changjiang
 * Date: 16/10/20
 * Time: 16:21
 * To change this template use File | Settings | File Templates.
 */
public class JsonObjectUtils {


    private static ObjectMapper mapper;

    /**
     * 对象转string
     * @param object
     * @return
     */
    public static String ObjectToString(Object object){
        String resultStr = "";
        if(null==mapper){
            mapper = new ObjectMapper();
        }

        try {
            resultStr = getObjectMapper().writeValueAsString(object);
        } catch (IOException e) {
            e.printStackTrace();
            resultStr= "";
        }

        return resultStr;
    }

    /**
     * string转对象
     * @param requestMsg
     * @param c
     * @param <T>
     * @return
     */
    public static <T> T StringToObject(String requestMsg,Class<T> c){
        try {
            return getObjectMapper().readValue(requestMsg, c);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * json封裝方法
     * @return
     */
    public static ObjectMapper getObjectMapper() {
        if(mapper == null){
            mapper  = new ObjectMapper();

            mapper.setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
            mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
            mapper.configure(DeserializationConfig.Feature.WRAP_EXCEPTIONS, false) ;
//			objectMapper.configure(DeserializationConfig.Feature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true) ;
//			objectMapper.configure(Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true) ;
            return mapper;
        }else{
            return mapper;
        }
    }


//    public static Object mapToObject(Map<String, Object> map, Class<?> beanClass) throws Exception {
//        if (map == null){
//            return null;
//        }
//
//        Object obj = beanClass.newInstance();
//
//        org.apache.commons.beanutils.BeanUtils.populate(obj, map);
//
//        return obj;
//    }

}
