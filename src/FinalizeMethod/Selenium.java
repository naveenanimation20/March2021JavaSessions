package FinalizeMethod;

public class Selenium {
	
	public int time = 10;
	
	
	@Override
	public void finalize() {
		System.out.println("Selenium -- finalize method....");
	}

}
