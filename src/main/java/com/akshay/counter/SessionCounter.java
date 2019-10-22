package com.akshay.counter;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SessionCounter {

	@Autowired
	private HttpSession session;
	
	@RequestMapping("/")
	public String index() {
		Integer count = (Integer) session.getAttribute("count");
		if (count == null) {
			count = 0;
			count++;
			session.setAttribute("count",count);
		}
		else {
			count++;
			session.setAttribute("count", count);
		}
		
		return "home.jsp";
	}
	
	@RequestMapping("/counter")
	public String count(Model model) {
		Integer count = (Integer) session.getAttribute("count");
//		model.addAttribute("count", count);		// this is used to send data from java file to view (HTML File)
		
		return "counter.jsp";
	}
	
	@RequestMapping("/double-increment")
	public String doubleImcrementor(Model model) {
		Integer count = (Integer) session.getAttribute("count");
		if (count == null) {
			count = 0;
			count += 2;
			session.setAttribute("count", count);
		}
		else {
			count += 2;
			session.setAttribute("count", count);
		}
		
		return "couble_increment.jsp";
	}
	
	@RequestMapping ("/reset")
	public String resetCount(Model model, HttpSession session) {
		session.setAttribute("count", 0);
		
		return "home.jsp";
	}
	
}
