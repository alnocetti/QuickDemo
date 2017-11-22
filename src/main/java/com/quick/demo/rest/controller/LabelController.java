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

import com.quick.demo.back.service.LabelService;
import com.quick.demo.db.entity.LabelEntity;

@RestController
@RequestMapping("/api/label")
public class LabelController {

	@Autowired
	private LabelService labelService;
	
	@RequestMapping(value = "",
            method = RequestMethod.GET,
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<LabelEntity> getLabels() {
		List<LabelEntity> labelsDTO = new ArrayList<LabelEntity>();
		return labelsDTO;
	}
	
	@RequestMapping(value = "/{id}",
	    method = RequestMethod.GET,
	    produces = {"application/json"})
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody LabelEntity getLabel(@PathVariable("id") Long id) {
		System.out.println("Get label with id: " + id);
		return labelService.findOne(id);
	}
	
	@RequestMapping(value = "",
            method = RequestMethod.POST,
            consumes = {"application/json"},
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.CREATED)
	public void createLabel(@RequestBody LabelEntity labelDTO) {
		LabelEntity label = new LabelEntity();
		label.setName(labelDTO.getName());
		label.setMail(labelDTO.getMail());
		labelService.createLabel(label);
	}

	@RequestMapping(value = "/{id}",
            method = RequestMethod.DELETE,
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") Long id) {
		System.out.println("Delete label with id: " + id);
		labelService.deleteById(id);
	}
	
}
