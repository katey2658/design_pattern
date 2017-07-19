package com.busyzero.visitor;

public class ConcreteElement implements Element {

	@Override
	public void doSomething() {
		System.out.println("ConcreteElement has been invoked....");
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
