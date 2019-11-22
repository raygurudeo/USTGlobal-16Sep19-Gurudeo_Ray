package javaassignment;

public class TestStudent {

	public static void main(String[] args) {

		Object[] obj = new Object[5];
		
		Student s1 = new Student(101, "Sonu", 60);
		Student s2 = new Student(102, "Pankaj", 65);
		Student s3 = new Student(103, "Rahul", 70);
		Student s4 = new Student(104, "Manish", 75);
		Student s5 = new Student(105, "Prince", 60);
		
		obj[0] = s1;
		obj[1] = s2;
		obj[2] = s3;
		obj[3] = s4;
		obj[4] = s5;
		
		System.out.println("<<--Iteration using for loop--->>");
		for(int i = 0; i<obj.length; i++) {
			
			System.out.println(obj[i]);
		}
		
		System.out.println("<<--Iteration using for-each loop--->>");
		for(Object value : obj) {
			
			System.out.println(value);
		}
		
	}

}
