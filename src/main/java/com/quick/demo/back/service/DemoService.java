/**
 * 
 */
package com.quick.demo.back.service;

import java.util.List;

import com.quick.demo.db.entity.DemoEntity;
import com.quick.demo.db.entity.dto.Demo;

/**
 * @author cristianhuichaqueo
 *
 */
public interface DemoService {

	public void deleteById(Long valueOf);
	
	public DemoEntity findOne(Long id);

	public List<DemoEntity> allDemos();

	public void createDemo(DemoEntity demo);

	public List<Demo> undeliveryDemos();

}
