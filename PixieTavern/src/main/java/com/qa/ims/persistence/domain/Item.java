package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Item {
	
	private Long id;
	private String name;
	private float price;
	
	public Item(String name, float price) {
		this.name = name;
		this.price = price;
	}
	
	public Item(Long id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Long getId() {return this.id;}
	public void setId(Long id) {this.id = id;}
	public String getName() {return this.name;}
	public void setName(String name) {this.name = name;}
	public float getPrice() {return this.price;}
	public void setPrice(float price) {this.price = price;}
	
	@Override
	public String toString() {
		return"id:" +id+ " name:" +name+ " price:" +price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price);
	}

	
}
