package com.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Prod_Details")
public class Product
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Prod_Id")
	private int id;
	@Column(name="Prod_Name")
	private String name;
	@Column(name="Prod_Quantity")
	private int quantity;
	@Column(name="Price")
	private int price;
	@Column(name="Availability")
	private String Availability;
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getQuantity() 
	{
		return quantity;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public String getAvailability() 
	{
		return Availability;
	}
	public void setAvailability(String availability)
	{
		Availability = availability;
	}
	public Product()
	{
		super();
	}
	
}
	
    