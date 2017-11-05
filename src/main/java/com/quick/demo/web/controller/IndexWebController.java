/**
 * 
 */
package com.quick.demo.web.controller;

import java.security.Principal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author cristianhuichaqueo
 *
 */
@Controller
public class IndexWebController {

	@Value("${accountUrl}")
	private String accountUrl;
	
	@GetMapping(path = "/")
	public ModelAndView index(Principal principal) {		
		if(!SecurityContextHolder.getContext().getAuthentication().isAuthenticated()){
			return  new ModelAndView("index");
		}else{			
			return new ModelAndView("redirect:/uploadDemo");	
		}	
	}
	
	@GetMapping(path = "/uploadDemo")
	public String uploadDemoWizard(Principal principal) {		
		return "/views/uploadDemo";
	}
	
	@RequestMapping("/profile")
    public String profile() {
        return "/views/profile";
    }
	
	@GetMapping(path = "/logout")
	public String logout(HttpServletRequest request) throws ServletException {
		request.logout();
		return "/";
	}

	@GetMapping(path = "/account")
	public String account(HttpServletRequest request) throws ServletException {
		return "redirect:"+accountUrl;
	}
    
    @GetMapping(path = "/password")
   	public String password(HttpServletRequest request) throws ServletException {
    	return "redirect:"+accountUrl + "password?attribute=redirectWithRedirectView";
   	}
    
    @GetMapping(path = "/identify")
   	public String identifyProvider(HttpServletRequest request) throws ServletException {
    	return "redirect:"+accountUrl + "identify";
   	}
    
}
