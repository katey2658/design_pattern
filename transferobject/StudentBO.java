package com.busyzero.transferobject;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {
	
	public List<StudentVO> studentList;
	
	public StudentBO() {
		this.studentList=new ArrayList<>();
	}
	
	
	public void save(StudentVO s){
		studentList.add(s);
	}
	
	public void listAll(){
		for(StudentVO s:studentList){
			System.out.println(s);
		}
	}
	
	public void remove(StudentVO s){
		int i=studentList.indexOf(s);
		studentList.remove(i);
	}

}
