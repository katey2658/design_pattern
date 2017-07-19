package com.busyzero.commond;

public class RemoteControlTest {
	
	public static void main(String[] args) {
		SimpleRemoteControl remote=new SimpleRemoteControl();
		Light light=new Light();
		LightOnCommond onCommond=new LightOnCommond(light);
		LightOffCommond offCommond=new LightOffCommond(light);
		
		System.out.println("������һ�£�������̫���ˣ��뿪һ�µơ�����");
		remote.setCommond(onCommond);
		remote.buttonWasPressed();		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("���ˣ����ǲ����˰ɣ�����Ҳ�ǿ�Ҫ˯����");
	}
}
