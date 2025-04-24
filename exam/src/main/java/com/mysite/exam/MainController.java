package com.mysite.exam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
    @GetMapping("/exam")
    @ResponseBody
    public String index() {
        return "index";
    }
    
    @GetMapping("/")
    public String root() {
    	return "redirect:/people/list";
    }
}
