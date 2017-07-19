package com.busyzero.transferobject;

import java.io.Serializable;
/**
 * 可序列化
 * 应为传输对象很可能需要被传输
 * @author 11456
 */
public class StudentVO implements Serializable{
	private String name;
	private Integer age;
	
	public StudentVO(String name,Integer age){
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", age=" + age + "]";
	}
	
}
