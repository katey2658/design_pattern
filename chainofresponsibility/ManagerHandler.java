package com.busyzero.chainofresponsibility;

public class ManagerHandler extends Handler {

	@Override
	void handle(int discount) {
		if(discount>Handler.DISCOUNT_FIFTY){
			successor.handle(discount);
		}else{
			System.out.println("�þ����Ѿ������˴������ۿ���"+discount);
		}
	}
}
