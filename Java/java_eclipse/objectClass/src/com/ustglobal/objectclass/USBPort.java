package com.ustglobal.objectclass;

public class USBPort {

	public static void connect(Object obj) {
		
		if(obj instanceof PenDrive) {
			PenDrive pd = (PenDrive)obj;
			pd.read();
			pd.write();
		}
		else if(obj instanceof Mouse) {
			Mouse mouse = (Mouse)obj;
			mouse.click();
			mouse.scroll();
		}
		else {
			System.out.println("Invalid port");
		}
	}
}
