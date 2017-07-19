package com.busyzero.prototype;

public class MainTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Prototype p1=new ConcretePrototype1();
		ConcretePrototype1 cp1=(ConcretePrototype1) p1.clone();
		System.out.println(cp1.FLAG);
		
		Prototype p2=new ConcretePrototype2();
		ConcretePrototype2 cp2=(ConcretePrototype2) p2.clone();
		System.out.println(cp2.FLAG);	
	}
}
