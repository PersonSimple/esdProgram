package com.example.accessingdatajpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;
//Pojo class  -
@Entity (name = "ESD_ANGLE")
public class Angle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private 	Long id;
	
	
	@Column(name="esd_column")
	private String email;
	

}
