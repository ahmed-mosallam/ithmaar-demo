package com.ithmaar.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.vladmihalcea.hibernate.type.json.JsonStringType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@TypeDef(name = "json", typeClass = JsonStringType.class)
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_id")
 private int empId;
	@Column(name="emp_name")
 private String empName;
	@Column(name="flex_field")
 private String flexField;
	@Type(type = "json")
	@Column(name="value" , columnDefinition = "json")	
 private String jsonValue;
 
}
