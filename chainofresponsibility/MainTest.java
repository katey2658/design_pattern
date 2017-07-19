package com.busyzero.chainofresponsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BossHandler bossHandler=new BossHandler();
		StuffHandler stuffHandler=new StuffHandler();
		ManagerHandler managerHandler=new ManagerHandler();
		
		stuffHandler.setSuccessor(managerHandler);
		managerHandler.setSuccessor(bossHandler);
		
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			System.out.print("请输入你想要的折扣：");
			int discount=Integer.valueOf(reader.readLine());
			stuffHandler.handle(discount);
		}
		
	}
}
