package com.inventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name = "STOCK_MODEL")
public class stockmodel 
{
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	
	@NotNull
	@Column(name = "ITEMNAME", nullable = false)
	private String itemname;
	
	@NotNull
	@Column(name = "TYPE", nullable = false)
	private String type;
	
	@NotNull
	@Column(name = "DETAILS", nullable = false)
	private String details;
	
	@NotNull
	@Column(name = "PURCHASEDATE", nullable = false)
	private String purchasedate;
	
	@NotNull
	@Column(name = "WARRENTY", nullable = false)
	private String warrenty; 
	
	@NotNull
	@Column(name = "COST", nullable = false)
	private String cost;
	
	@NotNull
	@Column(name = "QUANTITY", nullable = false)
	private String quantity;
	
	@NotNull
	@Column(name = "IMAGE", nullable = false)
	private String image;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getPurchasedate() {
		return purchasedate;
	}

	public void setPurchasedate(String purchasedate) {
		this.purchasedate = purchasedate;
	}

	public String getWarrenty() {
		return warrenty;
	}

	public void setWarrenty(String warrenty) {
		this.warrenty = warrenty;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
}
