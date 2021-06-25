package javasessions;

import java.util.ArrayList;
import java.util.List;

public class TestCar {

	public static void main(String[] args) {

		CarFactory c1 = new CarFactory("BMW", 65, "320S Lemo");
		CarFactory c2 = new CarFactory("Audi a4", 60, false);
		CarFactory c3 = new CarFactory("Honda civic", 25, "Black", "ivtec", true, 15.55, 'Y');

		System.out.println(c1.name + " " + c1.price + " " + c1.model);
		System.out.println(c1.isLaunched);

		System.out.println(c2.isAutomatic);
		
		String s = "Hello world!";
		System.out.println(s.substring(6,12)+s.substring(12, 6));
	
		
		List<Boolean> l = new ArrayList<>();
		l.add(Boolean.parseBoolean("FalSe"));
		System.out.println(l);
		
		int count = 0;
		while(count<s.length()) {
			if(s.charAt(count)=='i') {
				System.out.println(count);
			}
			count++;
		}

	
	}

}
