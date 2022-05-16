package com.skilldistillery.dogparks.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dog_park")
public class DogPark {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String address;
	
	private String city;
	
	private String state;
	
	private Integer size;
	
	

	public DogPark() {
		super();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DogPark [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", address=");
		builder.append(address);
		builder.append(", city=");
		builder.append(city);
		builder.append(", state=");
		builder.append(state);
		builder.append(", size=");
		builder.append(size);
		builder.append("]");
		return builder.toString();
	}

	public DogPark(int id, String name, String address, String city, String state, int size) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.size = size;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}


	
}
