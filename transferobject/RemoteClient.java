package com.busyzero.transferobject;

public class RemoteClient {

	public static void main(String[] args) {
		StudentBO bo=new StudentBO();
		
		StudentVO vo=new StudentVO("katey2658", 22);
		StudentVO vo1=new StudentVO("katey2888", 24);
		StudentVO vo2=new StudentVO("katey3358", 32);
		StudentVO vo3=new StudentVO("katey2633", 34);
		
		bo.save(vo);
		bo.save(vo1);
		bo.save(vo2);
		bo.save(vo3);
		
		bo.listAll();
		
		bo.remove(vo3);
		
		bo.listAll();
	}

}
