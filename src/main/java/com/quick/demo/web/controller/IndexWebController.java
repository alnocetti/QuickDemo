/**
 * 
 */
package com.quick.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cristianhuichaqueo
 *
 */
@Controller
public class IndexWebController {

	@RequestMapping("/")
    public String home() {
        return index();
    }
	
    public String index() {
        return "index.html";
    }
	
	@RequestMapping("/demo")
    public String demo() {
        return "/views/demo";
    }
	
	@RequestMapping("/dashboard")
    public String dashboard() {
        return "/views/dashboards-project";
    }
	
	@RequestMapping("/users")
    public String users() {
        return "/views/users";
    }
	
	@RequestMapping("/profile")
    public String profile() {
        return "/views/profile";
    }
	
}
