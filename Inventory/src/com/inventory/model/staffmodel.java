package com.inventory.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import com.sun.istack.internal.NotNull;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "STAFF_MODEL", uniqueConstraints = {
	       @UniqueConstraint(columnNames = "ID"),
	       @UniqueConstraint(columnNames = "EMAILID")
})
public class staffmodel 
{
	@Id
	@GeneratedValue  
	@Column(name = "ID")
	private int id;
	
	@NotNull
	@Column(name = "STAFFNAME", nullable = false)
	private String staffname;
	
	@NotNull
	@Column(name = "EMAILID", nullable = false)
	private String emailid;
	
	@NotNull   //@Transient  //This annotation instructs hibernate to not save a particular field.
	@Column(name = "PASSWORD", nullable = false)
	private String password;
	
	@NotNull
	@Column(name = "ADDRESS", nullable = false)
	private String address;
	
	@NotNull
	@Column(name = "JOINING_DATE", nullable = false)
	private String joiningDate;
	
	@NotNull
	@Column(name = "MOBILENO", nullable = false)
	private String mobileno;
	
	@NotNull
	@Column(name = "DEPARTMENT", nullable = false)
	private String department;
	
	@NotNull
	@Column(name = "DESIGNATION", nullable = false)
	private String designation;
	
	@NotNull
	@Column(name = "STATUS", nullable = false)
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStaffname() {
		return staffname;
	}

	public void setStaffname(String staffname) {
		this.staffname = staffname;
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

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
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
	
}
