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

import com.quick.demo.back.service.SendService;
import com.quick.demo.db.entity.Response;
import com.quick.demo.db.entity.SendEntity;
import com.quick.demo.db.entity.dto.Send;

@RestController
@RequestMapping("/api/send")
public class SendController {

	@Autowired
	private SendService sendService;
	
	@RequestMapping(value = "",
            method = RequestMethod.GET,
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<Send> getSenders() {
		List<Send> dtos = new ArrayList<Send>();
		for (SendEntity send : sendService.allSenders()){
			dtos.add(new Send(send));
		}
		return dtos;
	}
	
	@RequestMapping(value = "/{id}",
	    method = RequestMethod.GET,
	    produces = {"application/json"})
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody Send getSend(@PathVariable("id") Long id) {
		System.out.println("Get label with id: " + id);
		SendEntity sendEntity = sendService.findOne(id);
		return new Send(sendEntity);
	}
	
	@RequestMapping(value = "/{id}",
	    method = RequestMethod.PUT,
	    consumes = {"application/json"},
	    produces = {"application/json"})
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void updateSend(@PathVariable("id") Long id, @RequestBody String responseStatus) {
		SendEntity sendEntity = sendService.findOne(id);
		if (sendEntity != null) {
			sendEntity.setResponse(Response.valueOf(responseStatus));
			sendService.update(sendEntity);
		}
	}
	
}
