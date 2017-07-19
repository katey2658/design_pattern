package com.busyzero.mediator;

public abstract class Colleague {
	public int stateValue;

	public int getStateValue() {
		return stateValue;
	}

	public void setStateValue(int stateValue) {
		this.stateValue = stateValue;
	}
	
	abstract void setStateValue(int stateValue,Mediator mediator);	
}
