package javasessions;

import java.util.ArrayList;

public class StringConcept {

	public static void main(String[] args) {

		String s1 = "java";
		String s2 = "java";
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1 == s2);
		
		 s2 = "javaSelenium";
		 System.out.println(s2);
		 System.out.println(s1);//java
		 
		 String x = "100";
		 System.out.println(x+20);
		 //String to int:
		int i = Integer.parseInt(x);//100
		System.out.println(i+20);//120
		 
//		String y = "100A";
//		int j = Integer.parseInt(y);//NumberFormatException
//		System.out.println(j+20);
		
		String v = "12.33";
		System.out.println(v+20);
		double d = Double.parseDouble(v);//12.33
		System.out.println(d+20);
		
		String headless = "true";
		if(Boolean.parseBoolean(headless)) {
			System.out.println("PASS");
		}
		
		//int to String:
		int total = 200;
		System.out.println(total+20);
		String str = String.valueOf(total);//"200"
		System.out.println(str+20);
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		
	}

}
