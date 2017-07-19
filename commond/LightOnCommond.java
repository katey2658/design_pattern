package com.busyzero.commond;

public class LightOnCommond implements Commond {
	Light light;
	
	public LightOnCommond(Light light) {
		this.light=light;
	}

	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}

}
