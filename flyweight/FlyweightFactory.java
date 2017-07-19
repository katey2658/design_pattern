package com.busyzero.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	
	private static Map<String,Flyweight> flyWeightList=new HashMap<>();
	
	public Flyweight getFlyweight(String key){
		ConcreteFlyweight f=(ConcreteFlyweight) flyWeightList.get(key);
		if(f==null){
			ConcreteFlyweight fw=new ConcreteFlyweight();
			fw.setData(key);
			flyWeightList.put(key,fw);
			f=fw;
		}
		return f;
	}

}
