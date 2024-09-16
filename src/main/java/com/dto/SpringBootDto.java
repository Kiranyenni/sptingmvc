package com.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "emp99")
public class SpringBootDto {
	@Id
	int id;
	String name;
	Integer salary;
	String designation;

}
