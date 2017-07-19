package com.busyzero.visitor;

public class ConcreteVisitor implements Visitor {

	@Override
	public void visit(Element element) {
		element.doSomething();		
	}
}
