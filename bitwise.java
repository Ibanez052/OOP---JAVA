package assignment;

public class bitwise {
	public static void main(String[] args) {
		int a = 10; // 1010
		int b = 5; // 0101
		
		System.out.println((a & b) == 0);
		System.out.println(a | 0);
		System.out.println((a ^ b) != 15);
		System.out.println(a | b);
	}

}
