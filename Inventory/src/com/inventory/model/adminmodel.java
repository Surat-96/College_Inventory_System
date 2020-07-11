package com.inventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name = "ADMIN_MODEL")
public class adminmodel 
{
	@Id
	@GeneratedValue  //	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@NotNull
	@Column(name = "ADMINNAME", nullable = false)
	private String adminname;
	
	@NotNull
	@Column(name = "EMAILID", nullable = false)
	private String emailid;
	
	@NotNull
	@Column(name = "PASSWORD", nullable = false)
	private String password;
	
	@NotNull
	@Column(name = "ADDRESS", nullable = false)
	private String address;
	
	@NotNull
	@Column(name = "MOBILENO", nullable = false)
	private String mobileno;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdminname() {
		return adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	

}
