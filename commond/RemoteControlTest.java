package com.busyzero.commond;

public class RemoteControlTest {
	
	public static void main(String[] args) {
		SimpleRemoteControl remote=new SimpleRemoteControl();
		Light light=new Light();
		LightOnCommond onCommond=new LightOnCommond(light);
		LightOffCommond offCommond=new LightOffCommond(light);
		
		System.out.println("我想了一下，觉得天太黑了，想开一下灯。。。");
		remote.setCommond(onCommond);
		remote.buttonWasPressed();		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("算了，还是不开了吧，反正也是快要睡觉了");
	}
}
