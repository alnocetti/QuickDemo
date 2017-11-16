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

import com.quick.demo.back.service.ArtistService;
import com.quick.demo.back.service.DemoService;
import com.quick.demo.back.service.GenderService;
import com.quick.demo.back.service.LabelService;
import com.quick.demo.back.service.SendService;
import com.quick.demo.db.entity.ArtistEntity;
import com.quick.demo.db.entity.DemoEntity;
import com.quick.demo.db.entity.GenreEntity;
import com.quick.demo.db.entity.SendEntity;
import com.quick.demo.db.entity.dto.Label;
import com.quick.demo.db.entity.dto.UploadDemo;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

	@Autowired
	private DemoService demoService;
	@Autowired
	private GenderService genderService;
	@Autowired
	private LabelService labelService;
	@Autowired
	private ArtistService artistService;
	@Autowired
	private SendService sendService;
	
	@RequestMapping(value = "",
            method = RequestMethod.GET,
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<DemoEntity> getDemos() {
		List<DemoEntity> demos = demoService.allDemos();
		List<DemoEntity> demosDTO = new ArrayList<DemoEntity>();
		return demosDTO;
	}
	
	@RequestMapping(value = "/{id}",
	    method = RequestMethod.GET,
	    produces = {"application/json"})
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody DemoEntity getDemo(@PathVariable("id") Long id) {
		System.out.println("Get demo with id: " + id);
		DemoEntity demo = demoService.findOne(id);
		return null;
	}
	
	@RequestMapping(value = "",
            method = RequestMethod.POST,
            consumes = {"application/json"},
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.CREATED)
	public void createDemo(@RequestBody UploadDemo uploadDemo) {
		GenreEntity gender = genderService.findOne(uploadDemo.getDemo().getGenreId()); 
		DemoEntity demoEntity = new DemoEntity(uploadDemo.getDemo());
		demoEntity.setGender(gender);
		//demoService.createDemo(demoEntity);
		ArtistEntity artist = new ArtistEntity(uploadDemo.getArtist());
		artist.getDemos().add(demoEntity);
		artistService.createArtist(artist);
		for (Label label : uploadDemo.getLabels()){
			SendEntity sendEntity = new SendEntity();
			sendEntity.setDemo(demoEntity);
			sendEntity.setLabel(labelService.findOne(label.getLabelId()));
			sendService.createSend(sendEntity);
		}
	}

	@RequestMapping(value = "/{id}",
            method = RequestMethod.DELETE,
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") Long id) {
		System.out.println("Delete demo with id: " + id);
		demoService.deleteById(id);
	}

	/**
	 * @return the labelService
	 */
	public LabelService getLabelService() {
		return labelService;
	}

	/**
	 * @param labelService the labelService to set
	 */
	public void setLabelService(LabelService labelService) {
		this.labelService = labelService;
	}

	/**
	 * @return the artistService
	 */
	public ArtistService getArtistService() {
		return artistService;
	}

	/**
	 * @param artistService the artistService to set
	 */
	public void setArtistService(ArtistService artistService) {
		this.artistService = artistService;
	}

	/**
	 * @return the sendService
	 */
	public SendService getSendService() {
		return sendService;
	}

	/**
	 * @param sendService the sendService to set
	 */
	public void setSendService(SendService sendService) {
		this.sendService = sendService;
	}
	
}
