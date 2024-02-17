package com.ashish;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView display(HttpServletRequest request,HttpServletResponse res){
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		if(password.equals("ashish")){
			String message="Hello "+name;
			return new ModelAndView("hellopage","message",message);
		}
		else{
			return new ModelAndView("errorpage","message","Sorry,your username or password is incorrect");
		}
	}

}
