/**
 * 
 */
package com.quick.demo.back.service;

import java.util.List;

import com.quick.demo.db.entity.Demo;

/**
 * @author cristianhuichaqueo
 *
 */
public interface DemoService {

	public void deleteById(Long valueOf);
	
	public Demo findOne(Long id);

	public List<Demo> allDemos();

	public void createDemo(Demo demo);
	
}
