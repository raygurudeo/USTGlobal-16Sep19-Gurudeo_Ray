
public class StudentClass {

	int rollNo;
	String name;
	String branch;
	long mobile;
	String college;

	public StudentClass(int rollNo, String name, String branch, long mobile, String college) {
		this.rollNo = rollNo;
		this.name = name;
		this.branch = branch;
		this.mobile = mobile;
		this.college = college;
	}
	//	@Override
	public void getData() {
		System.out.println( "rollNo=" + rollNo + ",\n"
				+ " name=" + name + ",\n"
				+ " branch=" + branch + ",\n"
				+ " mobile=" + mobile+ ",\n"
				+ " college=" + college + "");
	}
	public static void main(String[] args) {
		StudentClass sc = new StudentClass(101, "Rahul", "CSE", 898278723, "IES");
		//		System.out.println(sc);
		sc.getData();
		StudentClass sc1 = new StudentClass(102, "Rana", "ec", 89756655, "lnct");
		sc1.getData();
		StudentClass sc3 = new StudentClass(103, "Sonu", "CS", 4578845, "ies");
		sc3.getData();
		StudentClass sc4 = new StudentClass(104, "Chandan", "cs", 45785544, "vit");
		sc4.getData();
		StudentClass sc5 = new StudentClass(105, "Manish", "ec", 89756655, "bit");
		sc5.getData();
		StudentClass sc6 = new StudentClass(106, "Ranjeet", "CS", 4578845, "oriental");
		sc6.getData();
		StudentClass sc7 = new StudentClass(107, "Kriti", "cs", 45785544, "vit");
		sc7.getData();
		StudentClass sc8 = new StudentClass(108, "Nisad", "ec", 89756655, "lnct");
		sc8.getData();
		StudentClass sc9 = new StudentClass(109, "Pradeep", "CS", 4578845, "ies");
		sc9.getData();
		StudentClass sc10 = new StudentClass(1010, "Pankaj", "cs", 45785544, "vit");
		sc10.getData();

	}

}
