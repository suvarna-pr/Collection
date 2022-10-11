package com.ty.collection;
import java.util.Iterator;
import java.util.TreeSet;;
public class Treeset {
	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<>();
		
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		System.out.println(t);
		Iterator<Integer> i=t.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
