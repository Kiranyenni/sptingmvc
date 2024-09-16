package com.service;


import org.springframework.stereotype.Component;

import com.dto.SpringBootDto;

@Component

public interface SpringBootService {
	
	public void saveemp(SpringBootDto dto);
	
	public void update(SpringBootDto dto, int id);
	
	public SpringBootDto get(Integer id);
	
	public void delete( Integer id);

	

}
