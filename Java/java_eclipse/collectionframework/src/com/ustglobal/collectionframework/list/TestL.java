package com.ustglobal.collectionframework.list;

import java.util.*;

public class TestL {

	public static void main(String[] args) {

		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(10);
		li.add(12);
		li.add(54);
		li.add(85);
		li.add(34);
		
		System.out.println("List before sorting "+li);
		Collections.sort(li);
		System.out.println("List after sorting "+li);
		
		Collections.reverse(li);
		System.out.println("List after reverse "+li);
		
		Collections.shuffle(li);
		System.out.println("List after shuffling "+li);
	}

}
