package javasessions;

public class StaticVsNonStatic {
	
	String name;
	static int age;
	
	public void getInfo() {
		System.out.println("get info.....");
	}
	
	public static void sendMain() {
		System.out.println("send mail...");
	}

	public static void main(String[] args) {

		StaticVsNonStatic obj = new StaticVsNonStatic();
		//non static stuff:
		obj.name = "Tom";
		System.out.println(obj.name);
		obj.getInfo();
		
		//static stuff:
		//no need to use object:
		//1. direct calling:
		age = 30;
		System.out.println(age);
		sendMain();
		//2. by class name:
		System.out.println(StaticVsNonStatic.age);
		StaticVsNonStatic.sendMain();
		
		System.out.println(0.1+0.2);
		
	}

}
