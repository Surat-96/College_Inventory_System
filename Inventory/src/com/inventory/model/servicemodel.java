package com.inventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name = "SERVICE_MODEL")
public class servicemodel 
{
	@Id
	@GeneratedValue  //	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SERID")
	private int serid;
	
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
	@Column(name = "TYPE", nullable = false)
	private String type;
	
	@NotNull
	@Column(name = "TIME", nullable = false)
	private String time;
	
	@NotNull
	@Column(name = "MSG", nullable = false)
	private String msg;
	
	@NotNull
	@Column(name = "STATUS", nullable = false)
	private String status;

	public int getSerid() {
		return serid;
	}

	public void setSerid(int serid) {
		this.serid = serid;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
