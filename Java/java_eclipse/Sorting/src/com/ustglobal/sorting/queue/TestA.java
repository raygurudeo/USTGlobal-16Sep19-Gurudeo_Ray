package com.ustglobal.sorting.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestA {

	public static void main(String[] args) {

		PriorityQueue pq = new PriorityQueue();
		pq.add(12);
		pq.add(8);
		pq.add(55);
		pq.offer(41);
//		pq.add(null);     null not alowed
		
		System.out.println("<------ using iterator -------->");
		Iterator i = pq.iterator();
		while(i.hasNext()) {
			
			System.out.println(pq.poll());
		}
		System.out.println("After poll "+pq);
	}

}
