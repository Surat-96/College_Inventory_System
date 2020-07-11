package com.inventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name = "APPLY_STOCK_MODEL")
public class applystock 
{
	@Id
	@GeneratedValue
	@Column(name = "REQ_ID")
	private int reqid;
	
	@NotNull
	@Column(name = "STAFFNAME", nullable = false)
	private String staffname;
	
	@NotNull
	@Column(name = "DEPARTMENT", nullable = false)
	private String department;
	
	@NotNull
	@Column(name = "ITEMNAME", nullable = false)
	private String itemname;
	
	@NotNull
	@Column(name = "QUANTITY", nullable = false)
	private String quantity;
	
	@NotNull
	@Column(name = "REQ_QUANTITY", nullable = false)
	private String req_quant;
	
	@NotNull
	@Column(name = "DATE", nullable = false)
	private String date;
	
	@NotNull
	@Column(name = "STATUS", nullable = false)
	private String status;

	public int getReqid() {
		return reqid;
	}

	public void setReqid(int reqid) {
		this.reqid = reqid;
	}

	public String getStaffname() {
		return staffname;
	}

	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getReq_quant() {
		return req_quant;
	}

	public void setReq_quant(String req_quant) {
		this.req_quant = req_quant;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

}
