package com.busyzero.mediator;

public class MainTest {
	public static void main(String[] args) {
		Colleague colleagueA=new ConcreteColleagueA();
		Colleague colleagueB=new ConcreteColleagueB();
		Mediator mediator=new ConcreteMediator(colleagueA, colleagueB);
		
		colleagueA.setStateValue(12, mediator);
		System.out.println("colleagueA value="+colleagueA.getStateValue()+"  colleagueB value="+colleagueB.getStateValue());
		
		colleagueB.setStateValue(787, mediator);
		System.out.println("colleagueA value="+colleagueA.getStateValue()+"  colleagueB value="+colleagueB.getStateValue());
	}
}
