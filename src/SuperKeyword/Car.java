package SuperKeyword;

public class Car extends Vehicle{
	
	int speed = 100;
	
	public Car() {
		super();
		System.out.println("car -- default");
	}
	
	public Car(int i) {
		System.out.println("car -- one param " + i);
	}
	
	public Car(int i, String s) {
		System.out.println("car -- two params " + i + s);
	}
	
	public void radio() {
		System.out.println("car -- radio");
	}

}
