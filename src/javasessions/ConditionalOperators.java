package javasessions;

public class ConditionalOperators {

	public static void main(String[] args) {

		
		int a = 100;
		int b = 20;
		
		System.out.println(a==b);
		
		if(a==b) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");
		}
		
		if(a>=b) {
			System.out.println("a is gr than b");
		}
		else {
			System.out.println("b is gr than a");
		}
		
		boolean flag = false;
		if(flag) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		if(false) {
			System.out.println("Hii");
		}
		else {//Dead code
			System.out.println("hello....");
		}
		
		System.out.println("hiiii");
		
		//< > <= >= == !=
		// if - if - if - if ....if
//		String browser = "chrome";
//		
//		if(browser.equals("chrome")) {
//			System.out.println("launch chrome");
//		}
//		
//		if(browser.equals("firefox")) {
//			System.out.println("launch firefox");
//		}
//		
//		if(browser.equals("IE")) {
//			System.out.println("launch IE");
//		}
//		
//		if(browser.equals("Safari")) {
//			System.out.println("launch Safari");
//		}
		
//		else {
//			System.out.println("please pass the right browser name....");
//		}
		
		//if - else if -- else if 
		
		String browser = "safari";
		
		if(browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		
		else if(browser.equals("firefox")) {
			System.out.println("launch firefox");

		}
		
		else if(browser.equals("IE")) {
			System.out.println("launch IE");

		}
		
		else if(browser.equals("safari")) {
			System.out.println("launch safari");

		}
		
		else {
			System.out.println("Please pass the correct br name ... " + browser);
		}
		
	}

}
