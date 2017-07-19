package com.busyzero.prototype;

public class ConcretePrototype1 extends Prototype {
	public static final String FLAG="ConcretePrototype1";
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (ConcretePrototype1)super.clone();
	}
}
