package com.ty.collection;

import java.util.HashMap;
import java.util.Map;

public class Hash2 {
	public static void main(String[] args) {
		HashMap<Integer, String> ob1=new HashMap<>();
		
		ob1.put(1, "Left");
		ob1.put(2, "Right");
		ob1.put(3, "Sign");
		
		
		
		HashMap<Integer, String> ob2=new HashMap<>();
		
		ob2.put(3, "red");
		ob2.put(4, "blue");
		ob2.put(5, "purple");
		
		ob1.putAll(ob2);
		
		System.out.println(ob2);


//		for(Map.Entry<Integer, String> m:ob1.entrySet())
//		{
//			System.out.println(m.getKey()+" "+m.getValue());
//		}
		//System.out.println(ob1);

	}

}