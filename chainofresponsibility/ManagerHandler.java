package com.busyzero.chainofresponsibility;

public class ManagerHandler extends Handler {

	@Override
	void handle(int discount) {
		if(discount>Handler.DISCOUNT_FIFTY){
			successor.handle(discount);
		}else{
			System.out.println("该经理已经进行了处理。。折扣是"+discount);
		}
	}
}
