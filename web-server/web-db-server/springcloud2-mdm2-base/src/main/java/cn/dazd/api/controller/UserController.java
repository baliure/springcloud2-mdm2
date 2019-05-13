package cn.dazd.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.ribbon.proxy.annotation.Hystrix;

import cn.dazd.api.base.UserI;
import cn.dazd.api.persistence.mybatis.SysUserMapper;
import cn.dazd.api.service.UserService;
import cn.dazd.entity.base.SysUser;

@RestController
public class UserController implements UserI {
	
	@Value("${server.port}")
	private String serverPort;
	
	@Autowired
	UserService userService;
	
	@Autowired
	SysUserMapper sysUserMapper;
	
	@RequestMapping("/getUser")
	public SysUser getUser(Long id) {
		SysUser user=new SysUser(id);
		return user;
	}
	


	@RequestMapping("/selectUserByName")
	@Override
	public List<SysUser> selectUserByName(String name) {
		List<SysUser> list=sysUserMapper.selectByLoginname(name);
		return list;
	}
}
