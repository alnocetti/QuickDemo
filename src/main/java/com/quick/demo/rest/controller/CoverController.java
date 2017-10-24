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

import com.quick.demo.back.service.CoverService;
import com.quick.demo.db.entity.Cover;
import com.quick.demo.db.entity.dto.CoverDTO;

@RestController
@RequestMapping("/api/cover")
public class CoverController {

	@Autowired
	private CoverService coverService;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createNewCategory(CoverDTO coverDTO) {
		Cover cover = new Cover();
		cover.setName(coverDTO.getName());
		cover.setImagePath(coverDTO.getImagePath());
		coverService.createCover(cover);
		return Response.status(201).entity(coverDTO).build();
	}

	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") String id) {
		System.out.println("Get cover with id: " + id);
		coverService.deleteById(Long.valueOf(id));
		return Response.status(200).entity("Cover removed").build();
	}
	
}
