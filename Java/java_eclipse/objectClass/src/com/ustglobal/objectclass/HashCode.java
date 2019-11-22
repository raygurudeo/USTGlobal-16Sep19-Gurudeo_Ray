package com.ustglobal.objectclass;

public class HashCode {

	public static void main(String[] args) {

		HashCode hc = new HashCode();
		int hashCode = hc.hashCode();
		System.out.println("Hash code of hc object = "+hashCode);
		
		HashCode hc1 = new HashCode();
		System.out.println("Hash code of hc1 object = "+hc1.hashCode());
		
		String toStrValue = hc1.toString();
		System.out.println("ToString value of hc1 object = "+toStrValue);
		
	}

}
