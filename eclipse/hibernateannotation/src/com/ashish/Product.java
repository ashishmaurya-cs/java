package com.ashish;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="annotation")
public class Product {
@Id
private int id;
private String product;
private double price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}


}
