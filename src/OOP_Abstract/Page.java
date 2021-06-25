package OOP_Abstract;

public abstract class Page {
	
	//abs class can have abs methods(no body) and non abs methods(with body)(
	//can not create the object of abs class
	//with abst..classes:
	//1. partial abstraction (0-100%)
	//2. 100% abstraction
	//3. 0% abstraction
	
	//can I create the const... of abstract class? : ans: yes
	//abs.. class const.. will be called when you create the Object of child class
	
	public Page() {
		System.out.println("Page -- const....");
	}
	
	public abstract void title();
	public abstract void header();

	public void timeOut() {
		System.out.println("Page timeout is 20 secs");
	}
	
	public final void logo() {
		System.out.println("App logo");
	}
	
	
	

}
