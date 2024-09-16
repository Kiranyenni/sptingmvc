package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.SpringBootDto;
import com.repo.SpringBootRepo;
@Service
public class SpringBootServiceImp  implements SpringBootService{
	@Autowired
	SpringBootRepo repo;
	
	public void saveemp(SpringBootDto dto) {
		repo.save(dto);
		
	}


	public void update(SpringBootDto SpringBootDtoinput, int id) {
		Optional<SpringBootDto> obj = repo.findById(id);
		SpringBootDto dto = obj.get();
		dto.setId(SpringBootDtoinput.getId());
		dto.setName(SpringBootDtoinput.getName());
		dto.setSalary(SpringBootDtoinput.getSalary());
		dto.setDesignation(SpringBootDtoinput.getDesignation());
		repo.save(dto);
		
	}


	
	public SpringBootDto get(Integer id) {

		 SpringBootDto dto = new SpringBootDto();
		Optional<SpringBootDto> obj = repo.findById(id);
		if (obj.isPresent()) {
			dto = obj.get();
		}

		return dto;
		
	}


	
	public void delete(Integer id) {
		repo.deleteById(id);
		
	}


	
	

}
