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

import com.quick.demo.back.service.GenreService;
import com.quick.demo.db.entity.GenreEntity;
import com.quick.demo.db.entity.dto.Genre;

@RestController
@RequestMapping("/api/genres")
public class GenreController {

	@Autowired
	private GenreService genreService;
	
	@RequestMapping(value = "",
            method = RequestMethod.GET,
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<Genre> getGenres() {
		List<GenreEntity> genres = genreService.allGenres();
		List<Genre> genresDTO = new ArrayList<Genre>();
		for (GenreEntity genre : genres){
			genresDTO.add(new Genre(genre));
		}
		return genresDTO;
	}
	
	@RequestMapping(value = "/{id}",
	    method = RequestMethod.GET,
	    produces = {"application/json"})
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody Genre getGenre(@PathVariable("id") Long id) {
		System.out.println("Get genre with id: " + id);
		GenreEntity genre = genreService.findOne(id);
		return new Genre(genre);
	}
	
	@RequestMapping(value = "",
            method = RequestMethod.POST,
            consumes = {"application/json"},
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.CREATED)
	public void createGenre(@RequestBody Genre genreDTO) {
		GenreEntity genre = new GenreEntity();
		genre.setName(genreDTO.getName());
		genreService.createGenre(genre);
	}

	@RequestMapping(value = "/{id}",
            method = RequestMethod.DELETE,
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") Long id) {
		System.out.println("Delete genre with id: " + id);
		genreService.deleteById(id);
	}
	
}
