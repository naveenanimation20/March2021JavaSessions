package SuperKeyword;

public class Honda extends Car{
	
	int speed = 150;
	
	public Honda() {
		super();
		System.out.println("honda -- default");
	}
	
	public void checkSpeed() {
		System.out.println(speed);
		System.out.println(super.speed);
	}
	
	@Override
	public void radio() {
		System.out.println("honda -- radio");
	}
	
	public void display() {
		radio();	
		super.radio();
	}
	
	

}
