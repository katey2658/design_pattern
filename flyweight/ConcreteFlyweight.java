package com.busyzero.flyweight;

public class ConcreteFlyweight implements Flyweight {
	
	private String data;

	@Override
	public void printData() {
		System.out.println("the data is:"+data);
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getData() {
		return data;
	}
}
