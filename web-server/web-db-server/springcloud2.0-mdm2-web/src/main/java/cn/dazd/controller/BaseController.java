package cn.dazd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.dazd.api.base.UserI;

@Controller
public class BaseController {
	@Autowired
	UserI useri;
	@RequestMapping("")
	public String hello(Model model) {
		return "hello";
	}
	

	@RequestMapping("selectUserByName")
	public String selectUserByName(Model model,String name) {
		

		model.addAttribute("users", useri.selectUserByName(name));
		
		return "user/selectUserResult";
	}
}
