package SwipeCard;

public class MainSwipeClass {

	public static void main(String[] args) {
		
		BTM b = new BTM();
		b.swipe();
		int count = b.getCount();
		int totalCount = b.getTotalCount();
		System.out.println("Count is = "+count);
		System.out.println("Total count = "+totalCount);
	}

}
