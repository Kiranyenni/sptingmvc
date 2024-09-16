package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.SpringBootDto;

public interface SpringBootRepo extends JpaRepository<SpringBootDto, Integer>{

}
