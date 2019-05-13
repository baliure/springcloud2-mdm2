package cn.dazd.api.base;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.dazd.entity.base.SysUser;

@FeignClient(value = "app-mdm-base")
public interface UserI {
	
	@RequestMapping("/getUser")
	SysUser getUser(@RequestParam("id") Long userId);
	
	@RequestMapping("/selectUserByName")
	List<SysUser> selectUserByName(@RequestParam("name") String name);
}
