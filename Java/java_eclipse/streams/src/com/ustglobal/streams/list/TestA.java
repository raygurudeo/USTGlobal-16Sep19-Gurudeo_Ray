package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestA {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(28);
		al.add(15);
		al.add(24);
		al.add(27);
		al.add(30);

		List<Integer> list = al.stream().filter(i -> i%3 == 0).collect(Collectors.toList());
		for(Integer i : list) {

			System.out.println(i);
		}

		List<Integer> l = al.stream().map(i -> i * i).collect(Collectors.toList());
		for(Integer i : list) {

			System.out.println(i);
		}
	}

}
