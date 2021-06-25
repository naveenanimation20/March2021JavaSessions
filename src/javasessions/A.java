package javasessions;

public class A {

	public static void main(String[] args) {

		System.out.println("A-main");

		// B.main(args);
		char a = 'X';
		int i = 0;
		System.out.println(true ? a : 0); // output X --> I am confused like one data type is Char & other is int (0);
											// .why it is coming as X;
		System.out.println(false ? i : a); // output 88.. // Here also confused ..

		String str = " ";
		if (str.isEmpty()) {
			System.out.println("blank string");
		} else {
			System.out.println("empty string");
		}

	}

}
