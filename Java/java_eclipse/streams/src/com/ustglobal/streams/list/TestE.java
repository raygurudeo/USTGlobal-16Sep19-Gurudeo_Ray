package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestE {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(28);
		al.add(15);
		al.add(24);
		al.add(27);
		al.add(30);
		
		List<Integer> l = al.stream().sorted().collect(Collectors.toList());
		Iterator<Integer> i = l.iterator();
		while(i.hasNext()) {
			
			Integer val = i.next();
			System.out.println(val);
		}
	}

}
