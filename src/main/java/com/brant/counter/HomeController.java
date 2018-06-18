package com.brant.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	int count=0;
	@RequestMapping("/")
	public String index(HttpSession session) {
			count+=1;
			session.setAttribute("count",count);
		return "index.jsp";
	}
}
