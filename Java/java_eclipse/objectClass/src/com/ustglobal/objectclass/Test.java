package com.ustglobal.objectclass;

public class Test {

	public static void main(String[] args) {

		PenDrive pd = new PenDrive();
		USBPort.connect(pd);
		
		Mouse mouse = new Mouse();
		USBPort.connect(mouse);
	}

}
