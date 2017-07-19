package com.busyzero.mediator;

public class ConcreteColleagueA extends Colleague {

	@Override
	public void setStateValue(int stateValue,Mediator mediator) {
		this.stateValue = stateValue;
		mediator.aAffectB();
	}

}
