package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller  
public class HelloSpringBootController {
	
	//@RequestMapping映射请求，用来处理请求地址映射的注解
	//可用于类或方法上。用于类上，表示类中的所有响应请求的方法都是以该地址作为父路径。
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView index(ModelAndView mv) {         //ModelAndView视图对象；信息模式
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value="/result", method=RequestMethod.POST)
    public ModelAndView send(@RequestParam("inputvalue") String inputvalue, ModelAndView mv) {
        mv.setViewName("result");
        mv.addObject("message", inputvalue);
        return mv;
    }

}
