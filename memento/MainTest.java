package com.busyzero.memento;

public class MainTest {
	public static void main(String[] args) {
		Originator originator=new Originator();
		originator.setState("this is the originator state");
		System.out.println("�����ԭʼ״̬�ǣ�"+originator.getState());
		Caretaker caretaker=new Caretaker();
		caretaker.setMemento(originator.createMemento());
		originator.setState("this is the changed state");
		System.out.println("�޸ĺ��״̬�ǣ�"+originator.getState());
		originator.restoreMemento(caretaker.getMemento());
		System.out.println("�ָ�֮���״̬��"+originator.getState());
	}
}
