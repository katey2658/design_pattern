package com.busyzero.memento;

public class MainTest {
	public static void main(String[] args) {
		Originator originator=new Originator();
		originator.setState("this is the originator state");
		System.out.println("输入的原始状态是："+originator.getState());
		Caretaker caretaker=new Caretaker();
		caretaker.setMemento(originator.createMemento());
		originator.setState("this is the changed state");
		System.out.println("修改后的状态是："+originator.getState());
		originator.restoreMemento(caretaker.getMemento());
		System.out.println("恢复之后的状态："+originator.getState());
	}
}
