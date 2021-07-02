package com.example.demo.app.inventory;

import javax.persistence.*;

@Entity
public class Item { //Class dedicated for inventory items, generating methods and constructors.
	
	@Id
	@Column(name="no",unique=true,nullable=false)
	private String no;
	private String name;
	private String amount;
	private String inventoryCode;
	
	public Item() {
	}

	public Item(String no, String name, String amount, String inventoryCode) {
		super();
		this.no = no;
		this.name = name;
		this.amount = amount;
		this.inventoryCode = inventoryCode;
	}
	
	public Item(Item newItem) {
		super();
		this.no = newItem.no;
		this.name = newItem.name;
		this.amount = newItem.amount;
		this.inventoryCode = newItem.inventoryCode;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getInventoryCode() {
		return inventoryCode;
	}

	public void setInventoryCode(String inventoryCode) {
		this.inventoryCode = inventoryCode;
	}

	
	
	
}
