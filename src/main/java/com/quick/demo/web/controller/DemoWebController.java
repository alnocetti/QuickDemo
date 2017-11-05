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
public class DemoWebController {

	@RequestMapping("/demo")
    public String demo() {
        return "/views/demo";
    }
	
}
