package com.quick.demo.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.quick.demo.back.service.DemoService;
import com.quick.demo.db.entity.Demo;
import com.quick.demo.db.entity.dto.DemoDTO;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

	@Autowired
	private DemoService demoService;
	
	@RequestMapping(value = "",
            method = RequestMethod.GET,
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<DemoDTO> getDemos() {
		List<Demo> demos = demoService.allDemos();
		List<DemoDTO> demosDTO = new ArrayList<DemoDTO>();
		for (Demo demo : demos){
			demosDTO.add(new DemoDTO(demo));
		}
		return demosDTO;
	}
	
	@RequestMapping(value = "/{id}",
	    method = RequestMethod.GET,
	    produces = {"application/json"})
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody Demo getDemo(@PathVariable("id") Long id) {
		System.out.println("Get demo with id: " + id);
		return demoService.findOne(id);
	}
	
	@RequestMapping(value = "",
            method = RequestMethod.POST,
            consumes = {"application/json"},
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.CREATED)
	public void createCover(@RequestBody DemoDTO demoDTO) {
		Demo demo = new Demo();
		demo.setDescription(demoDTO.getDescription());
		demo.setName(demoDTO.getName());
		demoService.createDemo(demo);
	}

	@RequestMapping(value = "/{id}",
            method = RequestMethod.DELETE,
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") Long id) {
		System.out.println("Delete demo with id: " + id);
		demoService.deleteById(id);
	}
	
}
