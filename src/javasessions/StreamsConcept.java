package javasessions;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamsConcept {

	public static void main(String[] args) {

		//JDK 1.8:
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("Tom");//0
		studentList.add("peter");//1
		studentList.add("naveen");//2
		studentList.add("Lisa");//3
		
		studentList.stream().forEach(e -> System.out.println(e));
		studentList.stream().filter(e -> e.equals("naveen")).forEach(e -> System.out.println(e));
	
		IntStream.range(1, 5).forEach(e -> System.out.println(e));
		
		IntStream.iterate(0, i -> i+2).limit(10).forEach(e -> System.out.println(e));
	
		//parallel stream: // more than 1000 elements
		studentList.parallelStream().forEach(e -> System.out.println(e));
	
	}

}
