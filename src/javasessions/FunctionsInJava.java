package javasessions;

public class FunctionsInJava {
	//class var
	int age;
	
	//class data members:
	//class vars
	//class methods
		//1. in built methods
		//2. user defined methods
			//method or function
			//is used to write the resuable code
	//2+2 = 4
	//3+2 = 5
	//function can not be created inside a function
	//duplicate funns are not allowed
	//we have to create the class object to call the function
	//functions are independent to each other
	//they are parallel to each other
	//can not return multiple values from the function
	
	
	//1. no input and no return
	//void -- does not return anything
	
	public void test() {
		System.out.println("test method");
	}
	
	//2. no input but some return
	//return type: String
	public String getName() {
		System.out.println("get name method");
		return "Selenium";
	}
	
	public int getScore() {
		System.out.println("get score method");
		//local vars
		int runs = 100;
		int wd = 10;
		int totalRuns = runs+wd;
		return totalRuns;
	}
	
	//3. some input and some return:
	public int add(int a, int b) {
		System.out.println("add method");
		int c = a+b;
		return c;
	}
	
	public double getMarks(double marks) {
		System.out.println("get marks method");
		double finalMarks = marks + 3.5;
		return finalMarks;
	}
	
	//4. some input but no return
	public void printInfo(String empName) {
		System.out.println("print info for :"  + empName);
	}
	
	
	public static void main(String[] args) {

		FunctionsInJava obj = new FunctionsInJava();
		obj.age = 25;
		
		obj.test();
		String name = obj.getName();
		System.out.println(name);
		
		int score = obj.getScore();
		System.out.println(score-5);
		System.out.println(obj.getScore());
		
		//call by value:
		int s1 = obj.add(10, 20);
		System.out.println(s1);
		
		s1 = obj.add(40, 50);
		System.out.println(s1);
		
		double d1 = obj.getMarks(35.55);
		System.out.println(d1);
		
		obj.printInfo("tom");
	}

}
