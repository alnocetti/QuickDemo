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
public class DashboardWebController {

	@RequestMapping("/dashboards-project")
    public String dashboard() {
        return "/views/dashboards-project";
    }
	
}
