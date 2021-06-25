package javasessions;

public class FunctionsExamples {

	// WAF - ip: student name(String)
	// return : marks (int)

	public int getStudentMarks(String studentName) {
			
		
		System.out.println("student name is : " + studentName);

		int marks = -1;

		if (studentName.equals("Asif")) {
			marks = 90;
		} else if (studentName.equals("Pavan")) {
			marks = 80;
		} else if (studentName.equals("Sri")) {
			marks = 95;
		} else {
			System.out.println("student not found..." + studentName);
		}

		return marks;

	}

	// WAF -- give me the browserName (String) -- input
	// and then launch the browser
	// an return the browser name (String)

	public String launchBrowser(String browserName) {
		System.out.println("browser name is : " + browserName);

		switch (browserName) {
		case "chrome":
			System.out.println("launch chrome");
			return "chrome";

		case "firefox":
			System.out.println("launch ff");
			return "firefox";

		case "IE":
			System.out.println("launch ie");
			return "IE";

		case "safari":
			System.out.println("launch safari");
			return "safari";

		default:
			System.out.println("plz pass the correct browser name " + browserName);
			return "INVALID_BROWSER_NAME 404 NOT FOUND";
		}
		
		//switch case and if-elseif
		// WAF -- give me the browserName (String) -- input
		// and then launch the browser
		// an return the browser version (double)
	}
	
	
	

	public static void main(String[] args) {

		FunctionsExamples obj = new FunctionsExamples();
		int m1 = obj.getStudentMarks("naveen");
		System.out.println(m1);
		
		String br = obj.launchBrowser("chrome");
		System.out.println(br);
	}

}
