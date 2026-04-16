package assignment;

public class ternaryops {
	public static void main(String[] args) {
		int x = 20;
		int y = 30;
		
		System.out.println((x < y) ? true : false); // true
		System.out.println((x > y) ? true : false); // false
		System.out.println((x < y) ? 25 : 0); //25
		System.out.println((x > y) ? 0 : 30); //30
	}

}
