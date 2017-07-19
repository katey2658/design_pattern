package com.busyzero.bridge;

public class AbstractionImpl implements Abstraction {
	
	private Implementor implementor;
	
	public AbstractionImpl(Implementor implementor){
		this.implementor=implementor;
	}

	@Override
	public void operation() {
		this.implementor.operation();
	}
}
