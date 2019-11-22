package com.ustglobal.sorting.list;

import java.util.*;

public class TestC {

	public static void main(String[] args) {

		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(12);
		li.add(54);
		li.add(34);
		li.add(55);
		
		Integer peekElement = li.peek();
		System.out.println("Peeked element : "+peekElement);
		Integer peekFirstElement = li.peekFirst();
		System.out.println("Peeked first element : "+peekFirstElement);
		Integer peekLastElement  = li.peekLast();
		System.out.println("Peeked last element : "+peekLastElement);
		System.out.println("After peek ------>"+li);
		
		System.out.println("<<-------- poll() -------->>");
		Integer pollElement = li.poll();
		System.out.println("Polled element : "+pollElement);
		Integer pollFirstElement = li.pollFirst();
		System.out.println("Polled first element : "+pollFirstElement);
		Integer pollLastElement  = li.pollLast();
		System.out.println("Polled last element : "+pollLastElement);
		System.out.println("After Pole ------>"+li);
		
		System.out.println("<<-------- push() & pull() -------->>");
		li.push(25);
		System.out.println("After push --->"+li);
		Integer p = li.pop();
		System.out.println("After pop --->"+li);
	}

}
