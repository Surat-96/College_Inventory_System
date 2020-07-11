package com.inventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;


@Entity
@Table(name = "ENQURY_MODEL")
public class enqrymodel 
{
	@Id
	@GeneratedValue  //	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@NotNull
	@Column(name = "NAME", nullable = false)
	private String name;
	
	@NotNull
	@Column(name = "EMAIL", nullable = false)
	private String email;
	
	@NotNull
	@Column(name = "DEPARTMENT", nullable = false)
	private String department;
	
	@NotNull
	@Column(name = "DESIGNATION", nullable = false)
	private String designation;
	
	@NotNull
	@Column(name = "TIME", nullable = false)
	private String time;
	
	@NotNull
	@Column(name = "MSG", nullable = false)
	private String msg;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	


}
