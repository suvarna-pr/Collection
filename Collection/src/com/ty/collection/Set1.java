package com.ty.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set1 {

	
	public static void main(String[] args) {
		
		Set<String> strings=new LinkedHashSet<>();
		
		strings.add("apple");
		strings.add("mango");
		strings.add("banana");
		
		System.out.println(strings);
	}

}
