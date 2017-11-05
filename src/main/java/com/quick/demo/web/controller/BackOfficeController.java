/**
 * 
 */
package com.quick.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author huicha
 *
 */
@Controller
public class BackOfficeController {

	@RequestMapping(value = "/bo")
	public String index() {
		return "bo";
	}

}
