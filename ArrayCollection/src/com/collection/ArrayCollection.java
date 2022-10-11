package com.collection;
import java.*;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayCollection {

			public static void main (String[] args) {
		        ArrayList<String>list=new ArrayList<String>();
		        list.add("Mango");
		         list.add("Apple");
		          list.add("Orange");
		          Iterator itr=list.iterator();
		          while(itr.hasNext())
		          {
		              System.out.println(itr.next());
		          }

	}

}
