package com.collection;
import java.util.*;
public class LinkedListCollection {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		
		
		//ADDING
		
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		Iterator< String> iterator=list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		//GETTING
		System.out.println(list.get(1));
		
		
		//SETTING
		
		list.set(2, "kiwi");
		
		System.out.println("Updated list");
		System.out.println(list);
		
		//REMOVING
		
	list.remove(1);
	System.out.println("List after deletion");
	System.out.println(list);
		
	}

}
