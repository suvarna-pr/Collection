package com.ty.collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

import org.w3c.dom.ls.LSException;
public class linkedhash {

	

	public static void main(String[] args) {
		LinkedHashSet<String> ls=new LinkedHashSet<>();
		
		ls.add("madhu");
		ls.add("shruthi");
		ls.add("aishwarya");
		
		System.out.println(ls);
		
		Iterator<String> i=ls.iterator();
		

	}

}
