package com.busyzero.bridge;

public class MainTest {
	public static void main(String[] args) {
		Implementor ip1=new ConcreteImplmentor1();
		Implementor ip2=new ConcreteImplmentor2();

		Abstraction ab1=new AbstractionImpl(ip1);
		ab1.operation();
		
		Abstraction ab2=new AbstractionImpl(ip2);
		ab2.operation();
	}
}
