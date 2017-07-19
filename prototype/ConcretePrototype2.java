package com.busyzero.prototype;

public class ConcretePrototype2 extends Prototype {
	public static final String FLAG="ConcretePrototype2";

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (ConcretePrototype2)super.clone();
	}
}
