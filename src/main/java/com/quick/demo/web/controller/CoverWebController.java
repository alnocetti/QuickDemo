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
public class CoverWebController {

	@RequestMapping("/cover")
    public String cover() {
        return "/views/cover";
    }
	
}
