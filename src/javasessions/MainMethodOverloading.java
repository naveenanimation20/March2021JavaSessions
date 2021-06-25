package javasessions;

public class MainMethodOverloading {

	public static void main(String naveen[]) {
		System.out.println("hello world");
		
		main(10);
	}
	
	public static void main(int a) {
		System.out.println("hello world" + a);

		System.out.println(a);

	}
	
	public static void main(int a, int b) {
		System.out.println("hello world" + a+b);

		System.out.println(a+b);

	}
	
	

}
