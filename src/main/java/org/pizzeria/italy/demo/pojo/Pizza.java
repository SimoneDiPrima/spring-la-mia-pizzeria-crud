package org.pizzeria.italy.demo.pojo;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Pizza {
	@NotNull
	@Column(length = 128)
	private String name;


	@NotNull(message="descriptiom must not be null")
	@Size(min=10, max=130, message="description must be more than 10 charachters")
	@Column(name="description", length=130)
	private String description;
	
	@Min(value=0)
	private int price;
	
	public Pizza() { }
	public Pizza(String name, String description, int price) {
		
		setName(name);
		setDescription(description);
		setPrice(price);
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	public String ToString(){
		return "il nome della pizza è :" + getName()
		+ "il suo costo è di :" + getPrice()+ "€";
		
	}
}

