package com.encore.parents;
/*
 * . Vehicle Super Ŭ������ �����մϴ�.
- ������ȣ(num), �𵨸�(model), ����(price)
 */

public class Vehicle {
	private int num;
	private String model;
	private double price;
	
	public Vehicle() {}
	
	public Vehicle(int num, String model, double price) {
		super();
		this.num = num;
		this.model = model;
		this.price = price;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return num + ", " + model + ", " + price;
	}
	
	
	
	

}
