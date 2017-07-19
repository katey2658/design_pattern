package com.busyzero.mediator;

public class ConcreteMediator implements Mediator {
	private Colleague colleagueA;
	private Colleague colleagueB;
	
	public ConcreteMediator(Colleague colleagueA,Colleague colleagueB){
		this.colleagueA=colleagueA;
		this.colleagueB=colleagueB;
	}

	@Override
	public void aAffectB() {
		int aValue=this.colleagueA.getStateValue();
		colleagueB.setStateValue(aValue*100);
	}

	@Override
	public void bAffectA() {
		int bValue=this.colleagueB.getStateValue();
		colleagueA.setStateValue(bValue/100);
	}

}
