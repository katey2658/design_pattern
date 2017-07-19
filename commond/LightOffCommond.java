package com.busyzero.commond;

public class LightOffCommond implements Commond {
	Light light;
	
	public LightOffCommond(Light light) {
		this.light=light;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}

}
