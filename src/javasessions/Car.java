package javasessions;

public class Car {
	//class  vars
	String name;
	int price;
	String color;
	static final int wheels = 4;
	

	public static void main(String[] args) {

		final int days = 7;//local var
		System.out.println(100 * days);
		
		Car c1 = new Car();
		c1.name = "Audi";
		c1.price = 70;
		c1.color = "White";
		
		System.out.println(c1.name + " " + c1.price + " " + c1.color + " " + Car.wheels);
		System.out.println(c1.wheels);//Not Recommended
		System.out.println(wheels);//direct calling
		
		
		Car c2 = new Car();
		c2.name = "Honda";
		c2.price = 20;
		c2.color = "Blue";
		
		Car c3 = new Car();
		c3.name = "BMW";
		c3.price = 60;
		c3.color = "Red";
		
		
		
	}

}
