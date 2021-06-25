package OOP_Interface;

public interface USMedical extends WHO, UNHG{

	static final int min_fee = 10;
	//vars are static and final by default
	
	// abstract method: no method body
	// only method decalration
	// only mehtod prototype
	// can not create the object of interface
	//100% abstraction: 

	public int orthoServices();

	public void neuroServices();

	public void emergencyServices();
	
	public void gynecServices();
	
	//after jdk 1.8:
	//1. you can have a static method with method body
	public static void billing() {
		System.out.println("USM - billing");
	}
	
	//2. default method with body:
	default void hiring() {
		System.out.println("USM -- hiring");
	}
	
	
	
	
	

}
