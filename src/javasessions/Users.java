package javasessions;

public class Users {

	

	// constructor
	// is not a function
	// const... name is as same as the class name
	// const.. will never return any value
	// const.. has no return type
	// functions --> for buss logic
	// const... -> is used to intialize the class vars
	//const.. will be called when we create the object
	//const.. can be overloaded

//	public Users() {// default -- 0 param const...
//		System.out.println("default const...");
//	}
//
//	public Users(int a) {// default -- 1 param const...
//		System.out.println(a);
//	}
//
//	public Users(int a, String s) {// default -- 2 params const...
//		System.out.println(a+s);
//	}
	
	//class vars:
	String name;
	int id;
	long phone;
	String email;
	
	public Users(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public Users(String name, int id, long phone) {
		this.name = name;
		this.id = id;
		this.phone = phone;
	}	

	public Users(String name, String email) {
		this.name = name;
		this.email = email;
	}
		
	public Users(String name, int id, long phone, String email) {
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.email = email;
	}

	public static void main(String a[]) {
		
		Users u1 = new Users("Tom", 30);
		System.out.println(u1.name);
		System.out.println(u1.id);
		System.out.println(u1.phone);
		
		Users u2 = new Users("Rohit", 31, 9898989);
		System.out.println(u2.name + " " + u2.id + " " + u2.phone + " " + u2.email);
		
		
		Users u3 = new Users("Asif", 32, 98977777, "asif@gmail.com");
		System.out.println(u3.name+ " " + u3.email);
		
	}

}
