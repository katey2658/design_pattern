package com.busyzero.chainofresponsibility;

public class StuffHandler extends Handler {

	@Override
	void handle(int discount) {
		if(discount>Handler.DISCOUNT_TWITTY){
			successor.handle(discount);
		}else{
			System.out.println("该员工已经进行了处理。。折扣是"+discount);
		}
	}
}
