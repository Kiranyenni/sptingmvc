package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.SpringBootDto;
import com.service.SpringBootService;

@RestController
public class SpringBootController {
	@Autowired
	SpringBootService service;
	
	@PostMapping("/save")
	public void saveemp(@RequestBody SpringBootDto dto) {
		service.saveemp(dto);
	}
	
	@PutMapping("/update/{id}")
	public void update(@RequestBody SpringBootDto dto, @PathVariable("id") int id) {
		service.update(dto, id);	
	}
	
	@GetMapping("/get")
	public SpringBootDto get(@RequestBody Integer id) {
		return service.get(id);
		
	}
	@DeleteMapping("/delete/{id}")

	public void delete(@PathVariable("id") Integer id) {
		service.delete(id);
	}
}

