package com.example.zzspringboot.controller;

import com.example.zzspringboot.pojo.Customerinfo;
import com.example.zzspringboot.utils.JsonUtils;
import com.example.zzspringboot.utils.RedisOperator;
import com.example.zzspringboot.utils.RestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;

@RestController
@RequestMapping("redis")
public class RedisController {
	
	@Autowired
	private StringRedisTemplate strRedis;
	
	@Autowired
	private RedisOperator redis;
	
	@RequestMapping("/test")
	public RestModel test() {

		Customerinfo customerinfo=new Customerinfo();
		customerinfo.setcName("springboot");
		strRedis.opsForValue().set("json:user", JsonUtils.objectToJson(customerinfo));
		
		Customerinfo jsonUser = JsonUtils.jsonToPojo(strRedis.opsForValue().get("json:user"), Customerinfo.class);
		
		return RestModel.data(jsonUser);
	}
//
//	@RequestMapping("/getJsonList")
//	public IMoocJSONResult getJsonList() {
//
//		User user = new User();
//		user.setAge(18);
//		user.setName("慕课网");
//		user.setPassword("123456");
//		user.setBirthday(new Date());
//
//		User u1 = new User();
//		u1.setAge(19);
//		u1.setName("imooc");
//		u1.setPassword("123456");
//		u1.setBirthday(new Date());
//
//		User u2 = new User();
//		u2.setAge(17);
//		u2.setName("hello imooc");
//		u2.setPassword("123456");
//		u2.setBirthday(new Date());
//
//		List<User> userList = new ArrayList<>();
//		userList.add(user);
//		userList.add(u1);
//		userList.add(u2);
//
//		redis.set("json:info:userlist", JsonUtils.objectToJson(userList), 2000);
//
//		String userListJson = redis.get("json:info:userlist");
//		List<User> userListBorn = JsonUtils.jsonToList(userListJson, User.class);
//
//		return IMoocJSONResult.ok(userListBorn);
//	}
}