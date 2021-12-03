package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Login;
import com.example.demo.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping
	public String index(Model model) {
		model.addAttribute("login", new Login());
		return "entry";
	}

	@PostMapping                                                        //HttpServletRequest 接口继承自 ServletRequest 接口，其主要作用是封装 HTTP 请求消息。
	public String create(@ModelAttribute("login") @Validated Login login, BindingResult result, Model model,HttpServletRequest request) {
		Login searchLogin = null;
		if(!result.hasErrors()) {
			searchLogin = loginService.searchByUserId(login);
		}
		
		if (result.hasErrors()) {                                   
			return "entry";
		} else {
			if(searchLogin == null) {
				loginService.save(login);
			}
			model.addAttribute("login",login);
			return "update";
		}
	}
	
	@PostMapping("update")    
	public String update(@ModelAttribute("login") @Validated Login login, BindingResult result, Model model,HttpServletRequest request) {
		Login searchLogin = null;
		if(!result.hasErrors()) {
				if(login.getPassword1() == null || "".equals(login.getPassword1())) {
					result.rejectValue("password1", null,"更新password入力してください。");
				}else if(login.getPassword2() == null || "".equals(login.getPassword2())) {
					result.rejectValue("password2", null,"確認password入力してください。");
				}else if(!login.getPassword1().equals(login.getPassword2())) {
					result.rejectValue("password2", null,"新passwordと確認passwordは一致ではありません。");
				}else {
					searchLogin = loginService.searchByPassword(login);
					if (searchLogin == null) {
						result.rejectValue("password", null, "入力したpasswordは不正です。");
					}
				}
		  }
			if(result.hasErrors()) {
				model.addAttribute("login",login);
				return "update";
			}else {
				login.setPassword(login.getPassword1());
				loginService.update(login);
				return "end";
			}
	}
}
