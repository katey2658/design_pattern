package com.busyzero.interpret;

public class TernimalExpression implements Expression {
	
	private String data;
	
	public TernimalExpression(String data) {
		this.data=data;
	}

	@Override
	public boolean interpret(String context) {
		if(this.data==data){
			return true;
		}
		return false;
	}

}
