package com.ty.collection;
import java.util.HashSet;
public class Hashset {

	public static void main(String[] args)
	{
		HashSet<String> s=new HashSet<>();
       
		s.add("one");
		s.add("two");
		s.add("three");
		
		
		
		HashSet<String> s1=new HashSet<>();
		
		System.out.println(s);
		System.out.println(s1);
		s.addAll(s1);
		System.out.println("after adding");
		System.out.println();
	}
}
