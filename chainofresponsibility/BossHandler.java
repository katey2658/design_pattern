package com.busyzero.chainofresponsibility;

public class BossHandler extends Handler {

	@Override
	void handle(int discount) {
		System.out.println("老板已经进行了处理。。折扣是"+discount);
	}
}
