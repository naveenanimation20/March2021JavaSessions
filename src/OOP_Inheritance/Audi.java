package OOP_Inheritance;

public class Audi extends Car{
	int max_speed = 200;
	//can we override the parent class vars?
	//---> variable hiding
	
	//Method Overriding: Poly+Morphsim : Dynamic (RunTime) 
	//when we have method in the parent class and the same method in the child class
	//with:
	//the same name
	//the same number of params
	//same return type
	//it should justify @Override
	//static methods can not be overridden
	//static methods can be overloaded
	//final methods can not be overridden
	//final class can not be inhertited/ can not be a parent class
		
	@Override
	public void start() {
		System.out.println("Audi -- start");
	}
	
	public void autoParking() {
		System.out.println("Audi -- auto parking");
	}
	
	//Method Hiding
	public static void steering() {
		System.out.println("Audi -- steering");
	}
	
	
	

}
