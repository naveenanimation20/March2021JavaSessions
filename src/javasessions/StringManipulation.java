package javasessions;

public class StringManipulation {

	public static void main(String[] args) {

		// Li = 0
		// len = 38
		// hi = len-1 = 37
		// 0-37
		String str = "hello This is my java code and I am so happy int";

		System.out.println(str.length());

		System.out.println("Li = " + 0);
		System.out.println("len = " + str.length());
		System.out.println("hi = " + (str.length() - 1));

		System.out.println(str.charAt(0));
		System.out.println(str.charAt(9));
		System.out.println(str.charAt(37));
		// System.out.println(str.charAt(38));//StringIndexOutOfBoundsException

		System.out.println(str.indexOf('j'));
		System.out.println(str.indexOf('i'));// 1st occurrence of i
		System.out.println(str.indexOf('i', str.indexOf('i') + 1));// 2nd occurrence of i

		System.out.println(str.indexOf("java"));
		System.out.println(str.indexOf("naveen"));// -1

		String messg = "product macbook has been added to cart";
		if (messg.indexOf("macbook") != -1) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		// welcome null

		// trim:
		String s1 = "    hello world    ";
		System.out.println(s1.trim().replace(" ", ""));

		// replace:
		String dob = "01-01-1990"; // 01/01/1990
		System.out.println(dob.replace("-", "/"));

		// uppercase and lowercase:
		String s2 = "i am a java tester";
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());

		// subString:
		String s3 = "hi I am using selenium";
		System.out.println(s3.substring(5));
		System.out.println(s3.substring(5, 11));

		// split:
		String lang = "Java_Python_Ruby_CSharp_JavaScript";
		String lan[] = lang.split("_");

		// System.out.println(lan[0]);//Java
		for (String e : lan) {
			System.out.println(e);
		}

		String st = "xXtestingXxXseleniumXXxXJavax";
		String st1[] = st.split("xX");
		System.out.println(st1[0]);
		System.out.println(st1[1]);
		System.out.println(st1[2]);
		System.out.println(st1[3]);
		// System.out.println(st1[4]);

		String reg1 = "Tom;peter;tom@gmail.com;909090;tom@123";
		String reg2 = "prateek;Arch;tom@gmail.com;909090;tom@123";

		for (String e : reg1.split(";")) {
			System.out.println(e);
		}
		
		//contains:
		String test = "welcome admin";
		System.out.println(test.contains("admin"));
		if(test.contains("admin")) {
			System.out.println("PASS");
		}
		
		//concat:
		String t1 = "testing";
		String t2 = "selenium";
		System.out.println(t1.concat(t2));
		
		//equals:
		String p1 = "selenium code";
		String p2 = "selenium Code ";
		String p3 = "selenium code";
		
		String p4 = new String("java");
		String p5 = new String("java");


		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equalsIgnoreCase(p2));

		
		//print a string with " "
		//I use "Selenium" with "Java" and "POM"
		
		System.out.println("I use \"Selenium\" with \"Java\" and \"POM\"");
		System.out.println("I use \"Selenium\" with \"Java\" and \"POM\"");
		
		//I use "'Eclipse'" and 'Java'
		System.out.println("I use \"'Eclipse'\" and 'Java'");
		
		//xpath
		//input[@id='username']
		System.out.println("//input[@id='username']");
		

		// Reverse a String:
		String s5 = "selenium";// 0-7 --> 8
		char c[] = s5.toCharArray();

		String rev = "";

		for (int i = s5.length() - 1; i >= 0; i--) {
			rev = rev + s5.charAt(i);// muineleS
		}
		System.out.println(rev);

//		System.out.println(reverse("Testing"));
//		System.out.println(reverse("I"));
//		System.out.println(reverse(null));
//		System.out.println(reverse(" "));
		System.out.println(reverse(" "));

//		System.out.println(getXpath("naveen"));
//		System.out.println(getXpath("email"));

	}
	
	public static String getXpath(String value) {
		//input[@id='username']
		String xpath = "input[@id='"+value+"']";
		return xpath;
	}

	// WAF to reverse the String
	// return the reveresed string

	public static String reverse(String str) {
		if(str == null) return "NULL STRING";
		if(str.equals(" ")) return "BLANK STRING";
		if(str.isEmpty()) return "EMPTY STRING";
		if(str.length()==1) return str;

		String rev = "";
		for (int i = str.length()-1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		return rev;
	}

}
