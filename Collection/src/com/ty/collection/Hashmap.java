package com.ty.collection;
import java.util.HashMap;import java.util.Map;
public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> ob1=new HashMap<>();
		
		ob1.put(1, "Left");
		ob1.put(2, "Right");
		ob1.put(3, "Sign");
		ob1.put(3, "Straight");
		ob1.put(4, "Straight");
		//ob1.put(4, "cross");//rewrite previous value
		for(Map.Entry<Integer, String> m:ob1.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		//System.out.println(ob1);

	}

}
