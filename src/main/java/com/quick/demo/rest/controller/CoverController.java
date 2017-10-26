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

import com.quick.demo.back.service.CoverService;
import com.quick.demo.db.entity.Cover;
import com.quick.demo.db.entity.dto.CoverDTO;

@RestController
@RequestMapping("/api/cover")
public class CoverController {

	@Autowired
	private CoverService coverService;
	
	@RequestMapping(value = "",
            method = RequestMethod.GET,
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<CoverDTO> getCovers() {
		List<Cover> covers = coverService.allCovers();
		List<CoverDTO> coversDTO = new ArrayList<CoverDTO>();
		for (Cover cover : covers){
			coversDTO.add(new CoverDTO(cover));
		}
		return coversDTO;
	}
	
	@RequestMapping(value = "/{id}",
	    method = RequestMethod.GET,
	    produces = {"application/json"})
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody CoverDTO getCover(@PathVariable("id") Long id) {
		System.out.println("Get cover with id: " + id);
		Cover cover = this.coverService.findOne(id);
		return new CoverDTO(cover);
	}
	
	@RequestMapping(value = "",
            method = RequestMethod.POST,
            consumes = {"application/json"},
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.CREATED)
	public void createCover(@RequestBody CoverDTO coverDTO) {
		Cover cover = new Cover();
		cover.setName(coverDTO.getName());
		cover.setImagePath(coverDTO.getImagePath());
		coverService.createCover(cover);
	}

	@RequestMapping(value = "/{id}",
            method = RequestMethod.DELETE,
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") Long id) {
		System.out.println("Delete cover with id: " + id);
		coverService.deleteById(id);
	}
	
}
