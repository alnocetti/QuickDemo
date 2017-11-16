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

import com.quick.demo.back.service.GenderService;
import com.quick.demo.db.entity.GenreEntity;
import com.quick.demo.db.entity.dto.GenderDTO;

@RestController
@RequestMapping("/api/genders")
public class GenderController {

	@Autowired
	private GenderService genderService;
	
	@RequestMapping(value = "",
            method = RequestMethod.GET,
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<GenderDTO> getGenders() {
		List<GenreEntity> genders = genderService.allGenders();
		List<GenderDTO> gendersDTO = new ArrayList<GenderDTO>();
		for (GenreEntity gender : genders){
			gendersDTO.add(new GenderDTO(gender));
		}
		return gendersDTO;
	}
	
	@RequestMapping(value = "/{id}",
	    method = RequestMethod.GET,
	    produces = {"application/json"})
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody GenderDTO getGender(@PathVariable("id") Long id) {
		System.out.println("Get gender with id: " + id);
		GenreEntity gender = genderService.findOne(id);
		return new GenderDTO(gender);
	}
	
	@RequestMapping(value = "",
            method = RequestMethod.POST,
            consumes = {"application/json"},
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.CREATED)
	public void createGender(@RequestBody GenderDTO genderDTO) {
		GenreEntity gender = new GenreEntity();
		gender.setName(genderDTO.getName());
		genderService.createGender(gender);
	}

	@RequestMapping(value = "/{id}",
            method = RequestMethod.DELETE,
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") Long id) {
		System.out.println("Delete gender with id: " + id);
		genderService.deleteById(id);
	}
	
}
