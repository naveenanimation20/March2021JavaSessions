package javasessions;

public class CarFactory {

	String name;
	int price;
	String color;
	String model;
	boolean isLaunched;
	double mileage;
	char isAutomatic;
	

	public CarFactory(String name, int price, String model) {
		this.name = name;
		this.price = price;
		this.model = model;
	}

	public CarFactory(String name, String color, String model, double mileage) {
		this.name = name;
		this.color = color;
		this.model = model;
		this.mileage = mileage;
	}

	public CarFactory(String name, int price, boolean isLaunched) {
		this.name = name;
		this.price = price;
		this.isLaunched = isLaunched;
	}

	public CarFactory(String name, int price, String color, String model, boolean isLaunched, double mileage,
			char isAutomatic) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.model = model;
		this.isLaunched = isLaunched;
		this.mileage = mileage;
		this.isAutomatic = isAutomatic;
	}

}
