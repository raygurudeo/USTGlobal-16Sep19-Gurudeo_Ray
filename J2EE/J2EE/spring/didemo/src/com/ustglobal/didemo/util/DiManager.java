package com.ustglobal.didemo.util;

import com.ustglobal.didemo.dao.I;

import com.ustglobal.didemo.dao.impl.A;

public class DiManager {

	A a = null;
	public I getI() {
		if(a==null) {
			a = new A();
		}
		return a;
	}
}
