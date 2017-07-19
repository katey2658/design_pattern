package com.busyzero.flyweight;

public class MainTest {
	public static void main(String[] args) {
		FlyweightFactory factory=new FlyweightFactory();
		
		ConcreteFlyweight cf=(ConcreteFlyweight) factory.getFlyweight("katey2658");
		cf.printData();
		
		ConcreteFlyweight cf2=(ConcreteFlyweight) factory.getFlyweight("katey2658");
		cf.printData();

		System.out.println("两者是不是同一个对象："+(cf==cf2));
		
	}
}
