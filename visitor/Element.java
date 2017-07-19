package com.busyzero.visitor;

public interface Element {
	void accept(Visitor visitor);
	void doSomething();
}
