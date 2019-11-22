package com.ustglobel.googlelogin;

public class Test {

	public static void main(String[] args) {

		Browser b = new Browser();
		
		Google gmail = new Gmail();
		b.open(gmail);
		System.out.println("----------");
		
		Google gDrive = new GoogleDrive();
		b.open(gDrive);
	}

}
