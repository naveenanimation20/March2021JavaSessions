package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;
		String x = "Hello";
		String y = "Selenium";
		double c = 12.33;
		double d = 34.44;
		
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+""+b);//100200
		
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
		System.out.println("the value of a is: " + a);
		System.out.println("the value of b is: " + b);
		System.out.println("sum is: " + (a+b));

		System.out.println(a+b+c+d+x+y);
		System.out.println(x+y+c+d+a+b);
		
		char c1 = 'a';
		char c2 = 'b';
		//a-z -> 97 to 122
		//A-Z -> 65 to 90
		//0-9 -> 48 to 57
		System.out.println(c1);
		System.out.println(c1+c2);//97+98=195
		System.out.println(c1-c2);//97-98 = -1
		System.out.println(c1/c2);
		System.out.println(c1*c2);
		
	}

}
