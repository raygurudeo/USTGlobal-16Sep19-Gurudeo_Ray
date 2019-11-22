package com.ustglobal.sorting.set;

import java.util.Comparator;

public class EmployeeAsortByName {

	Comparator<EmployeeA> compName = (e1, e2) -> {
		
		return e1.name.compareTo(e2.name);
	};
}
