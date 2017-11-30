package com.quick.demo.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.quick.demo.back.service.SendService;
import com.quick.demo.db.entity.dto.SharedDemos;

@RestController
@RequestMapping("/api/shared")
public class SharedDemoController {

	@Autowired
	private SendService sendService;
	
	@RequestMapping(value = "",
            method = RequestMethod.GET,
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<SharedDemos> getShareds() {
		return sendService.allSharedDemos();
	}
	
}
