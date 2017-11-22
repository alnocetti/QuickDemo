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
        return dashboard();
    }
	
	@RequestMapping("/demo")
    public String demo() {
        return "/views/demo";
    }
	
	@RequestMapping("/dashboards-project")
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
