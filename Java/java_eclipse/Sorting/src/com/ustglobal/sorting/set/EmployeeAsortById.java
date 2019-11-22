package com.ustglobal.sorting.set;

import java.util.Comparator;

public class EmployeeAsortById {

	Comparator<EmployeeA> compId = (e1, e2) -> {
		
		if (e1.id > e2.id) {
			
			return 1;
		}
		else if (e1.id < e2.id) {
			
			return -1;
		}
		else {
			
			return 0;
		}
	};
}
