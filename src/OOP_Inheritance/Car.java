package OOP_Inheritance;

public class Car extends Vehicle{
	int max_speed = 100;
	
	public void start() {
		System.out.println("car -- start");
	}
	
	public void stop() {
		System.out.println("car -- stop");
	}
	
	public void refuel() {
		System.out.println("car -- refuel");
	}
	
	public static void steering() {
		System.out.println("car -- steering");
	}
	
	
	
	

}
