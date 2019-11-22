
public class ConstructorOverloading {

	String name;
	int id;
	long adharNo;
	
	public ConstructorOverloading(String name, int id, long adharNo) {
		this.name = name;
		this.id = id;
		this.adharNo = adharNo;
	}
	public ConstructorOverloading(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public ConstructorOverloading(int id, String name) {
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "ConstructorOverloading [name=" + name + ", id=" + id + ", adharNo=" + adharNo + "]";
	}
	
}
