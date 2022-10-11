package com.collection;
import java.util.*;
public class PriorityQueueCollection {

	public static void main(String[] args) {
	
		PriorityQueue<String> queue=new PriorityQueue<String>();
		
		
		//adding
		
		queue.add("apple");
		queue.add("kiwi");
		queue.add("banana");
		
		//traversing
		
		Iterator<String> itr=queue.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
		//remove
		
		
		queue.remove();//REMOVES AT THE END OF QUEUE
		
		queue.poll();//REMOVES AT THE FRONT
		System.out.println("After removing"+queue);
		
		
		//SINCE PQ FOLLOWS FIFO ORDER WE CAN ONLY ACCESS THE FIRST ELEMENT SO WE USE PEEK
		
		String ele=queue.peek();
		System.out.println(ele);
	}

}
