package com.busyzero.mediator;

public class ConcreteColleagueB extends Colleague {

	@Override
	public void setStateValue(int stateValue,Mediator mediator) {
		this.stateValue = stateValue;
		mediator.bAffectA();
	}

}
