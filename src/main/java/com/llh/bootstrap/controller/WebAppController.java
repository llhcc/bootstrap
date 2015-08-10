package com.llh.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebAppController {
	
	@RequestMapping(value="/menu.htm")
	public String menu() {
		return "menu";
	}
	
	@RequestMapping("/index.htm")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping("/403.htm")
	public String error403() {
		return "common/403";
	}
	
	@RequestMapping("/404.htm")
	public String error404() {
		return "common/404";
	}
	
	@RequestMapping("/500.htm")
	public String error500() {
		return "common/500";
	}
	
	@RequestMapping("/503.htm")
	public String error503() {
		return "common/503";
	}

}
