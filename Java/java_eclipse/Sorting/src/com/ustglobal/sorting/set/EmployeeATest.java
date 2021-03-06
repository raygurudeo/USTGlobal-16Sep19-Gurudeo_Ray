package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeATest {

	public static void main(String[] args) {

		Comparator<EmployeeA> comp = (e1, e2) -> {
			
			if(e1.height > e2.height) {
				
				return 1;
			}
			else if(e1.height < e2.height) {
				
				return -1;
			}
			else {
				
				return 0;
			}
		};
		
		TreeSet<EmployeeA> ts = new TreeSet<EmployeeA>(comp);
		ts.add(new EmployeeA(101, "Michel", 5.5));
		ts.add(new EmployeeA(100, "Shawn", 6.2));
		ts.add(new EmployeeA(105, "Clarke", 7.2));
		ts.add(new EmployeeA(104, "Andrew", 5.9));
		
		System.out.println("<------- using iterator ------->");
		Iterator<EmployeeA> i = ts.iterator();
		while(i.hasNext()) {
			
			EmployeeA e = i.next();
			System.out.println("ID : "+e.id);
			System.out.println("Name : "+e.name);
			System.out.println("Height : "+e.height);
			System.out.println("-----------------");
		}
	}

}
