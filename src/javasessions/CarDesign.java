package javasessions;

public class CarDesign {

	String name;
	String color;
	int price;
	double mileage;
	boolean isLaunched;
	char type;

	public static void main(String[] args) {

		CarDesign c1 = new CarDesign();
		c1.name = "Audi";
		c1.color = "white";
		c1.price = 80;
		c1.mileage = 10.12;
		c1.isLaunched = true;
		c1.type = 'A';
		System.out.println(c1.name + " " + c1.price + " " 
					+ c1.mileage + " " + c1.isLaunched + " " + c1.type);
		
		CarDesign c2 = new CarDesign();
		c2.name = "BMW";
		c2.color = "Blue";
		c2.price = 70;
		c2.mileage = 13.12;
		c2.isLaunched = false;
		c2.type = 'A';
		System.out.println(c2.name + " " + c2.price + " " 
					+ c2.mileage + " " + c2.isLaunched + " " + c2.type);

	}

}
