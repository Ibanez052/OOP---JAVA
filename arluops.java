package assignment;

public class arluops {
	public static void main(String[] args) {
		int a = 20;
		int b = 40;
		boolean result;
		
		result = (a > b) && (b > 10);
		System.out.println(result ? "TRUE" : "FALSE");
		
		result = (a < b) || (b < 10);
		System.out.println(result ? "TRUE" : "FALSE");
		
		result = !(a > b);
		System.out.println(result ? "TRUE" : "FALSE");
		
		int c = a + 20;
		System.out.println(c);
		
		result = (++a == 21);
		System.out.println(result ? "TRUE" : "FALSE");
		
		result = (a == b);
		System.out.println(result ? "TRUE" : "FALSE");
		
		result = (a > b);
		System.out.println(result ? "TRUE" : "FALSE");
		
		int d = b * 2;
		System.out.println(d);
		
	}
}
