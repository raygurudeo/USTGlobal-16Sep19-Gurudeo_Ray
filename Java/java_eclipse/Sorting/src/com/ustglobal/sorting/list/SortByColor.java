package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByColor implements Comparator<Marker> {

	@Override
	public int compare(Marker c1, Marker c2) {
		
		String s = c1.color;
		String t = c2.color;
		
		return s.compareTo(t);
	}
}
