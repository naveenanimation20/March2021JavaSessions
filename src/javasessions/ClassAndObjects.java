package javasessions;

public class ClassAndObjects {
	//class -- its a blueprint/template/category for all the objects
	//object -- its a physical entity of the class
	//its an instance of the class
	//data members --> method, class variables

	int age;//class var
	String name;
	
	public static void main(String[] args) {

		int i = 10;//local var
		System.out.println(i);
		
		ClassAndObjects obj = new ClassAndObjects();
		
		obj.name = "Tom";
		obj.age = 25;
		System.out.println(obj.name + " " + obj.age);
		
		ClassAndObjects obj1 = new ClassAndObjects();
		obj1.name = "peter";
		obj1.age = 30;
		System.out.println(obj1.name + " " + obj1.age);
		
		ClassAndObjects obj2 = new ClassAndObjects();
		System.out.println(obj2.age);


		
	}

}
