package com.busyzero.chainofresponsibility;

public class BossHandler extends Handler {

	@Override
	void handle(int discount) {
		System.out.println("�ϰ��Ѿ������˴������ۿ���"+discount);
	}
}
