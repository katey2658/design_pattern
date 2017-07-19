package com.busyzero.visitor;

public class MainTest {
	public static void main(String[] args) {
		Visitor visitor=new ConcreteVisitor();
		Element element=new ConcreteElement();
		element.accept(visitor);
	}
}
