package cn.dazd.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;

import cn.dazd.api.base.UserI;

@RestController
public class TestController {
	@Value("${server.port}")
	private String serverPort;
	@Autowired
	UserI useri;

	@RequestMapping("/test")
	public Object test(Long id) {

		return "物料调用用户接口" + serverPort + ":" +JSON.toJSONString( useri.getUser(id));
	}

}
