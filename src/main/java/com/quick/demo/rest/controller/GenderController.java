package com.quick.demo.rest.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quick.demo.back.service.GenderService;
import com.quick.demo.db.entity.Gender;
import com.quick.demo.db.entity.dto.GenderDTO;

@RestController
@RequestMapping("/api/genders")
public class GenderController {

	@Autowired
	private GenderService genderService;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createNewCategory(GenderDTO categoryDTO) {
		Gender gender = new Gender();
		gender.setName(categoryDTO.getName());
		genderService.createGender(gender);
		return Response.status(201).entity(categoryDTO).build();
	}

	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") String id) {
		System.out.println("Get gender with id: " + id);
		genderService.removeGender(Long.valueOf(id));
		return Response.status(200).entity("Gender removed").build();
	}
	
}
