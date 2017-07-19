package com.busyzero.commond;

public class SimpleRemoteControl {
	Commond slot;
	public SimpleRemoteControl() {}
	
	public void setCommond(Commond commond){
		this.slot=commond;
	}
	
	 public void buttonWasPressed(){
		 slot.execute();
	 }
}
