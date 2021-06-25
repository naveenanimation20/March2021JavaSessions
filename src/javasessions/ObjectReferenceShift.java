package javasessions;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class ObjectReferenceShift {

	String name;
	int age;
	String city;

	public static void main(String[] args) {

		ObjectReferenceShift e1 = new ObjectReferenceShift();
		e1.name = "Madira";
		e1.age = 30;
		e1.city = "Pune";

		ObjectReferenceShift e2 = new ObjectReferenceShift();
		e2.name = "Shrvani";
		e2.age = 20;
		e2.city = "Delhi";

		ObjectReferenceShift e3 = new ObjectReferenceShift();
		e3.name = "Tej";
		e3.age = 25;
		e3.city = "Bangalore";

		// no ref objects--not recommended
//		new ObjectReferenceShift().name = "Tom";
//		new ObjectReferenceShift().age = 30;

		ObjectReferenceShift e4 = new ObjectReferenceShift();
		e4.name = "Tom";
		System.out.println(e4.name);// Tom
		e4 = null;
		// System.out.println(e4.name);//NPE

		System.out.println(e1.name + " " + e1.age + " " + e1.city);
		System.out.println(e2.name + " " + e2.age + " " + e2.city);
		System.out.println(e3.name + " " + e3.age + " " + e3.city);

		e1 = e2;

		System.out.println(e1.name + " " + e1.age + " " + e1.city);
		System.out.println(e2.name + " " + e2.age + " " + e2.city);
		System.out.println(e3.name + " " + e3.age + " " + e3.city);

		e2 = e3;

		System.out.println(e1.name + " " + e1.age + " " + e1.city);
		System.out.println(e2.name + " " + e2.age + " " + e2.city);
		System.out.println(e3.name + " " + e3.age + " " + e3.city);

		e3 = e1;

		System.out.println(e1.name + " " + e1.age + " " + e1.city);
		System.out.println(e2.name + " " + e2.age + " " + e2.city);
		System.out.println(e3.name + " " + e3.age + " " + e3.city);

	}

}
