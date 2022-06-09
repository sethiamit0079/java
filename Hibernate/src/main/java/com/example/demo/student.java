package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //iski table bnani hai DB me
public class student {
	
	@Id  //uniquely identify column
	private int id;
	private String name;
	private String ciy;
	public student(int id, String name, String ciy) {
		super();
		this.id = id;
		this.name = name;
		this.ciy = ciy;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCiy() {
		return ciy;
	}
	public void setCiy(String ciy) {
		this.ciy = ciy;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", ciy=" + ciy + "]";
	}
	
	

}

//@Table use to change the table details
//@id @GenratedValue auto incriment unique id
//@column can be used to specigy column mappings, to change column name in associate table in DB.
//@Transient this tells hibernate not to save filed
//@Temporal date format
//@oe to one @many to many


