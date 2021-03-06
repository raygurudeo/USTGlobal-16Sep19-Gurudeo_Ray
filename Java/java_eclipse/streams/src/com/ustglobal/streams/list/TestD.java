package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestD {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(20);
		marks.add(28);
		marks.add(15);
		marks.add(24);
		marks.add(27);
		marks.add(30);
		
		Comparator<Integer> cmp = (m1, m2) -> {
			
			if(m1 > m2) {
				
				return m1;
			}
			else if(m1 < m2) {
				
				return -1;
			}
			else {
				
				return 0;
			}
		};
		
		long noOfFailsStudent = marks.stream().filter(i -> i < 40).count();
		System.out.println(noOfFailsStudent);
		
		System.out.println("------------");
		Integer i = marks.stream().min(cmp).get();
		System.out.println("Min value : "+i);
		
		System.out.println("------------");
		Integer j = marks.stream().max(cmp).get();
		System.out.println("Max value : "+j);
	}

}
