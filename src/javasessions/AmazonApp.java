package javasessions;

public class AmazonApp {

	// Method Overloading: Poly(many) + Morphism (forms) --> compile time (static)
	// within the same class when we have diff methods:
	// with the same
	// with diff paramaters
	// with diff sequence of parameters
	public void login() {// 0 param

	}

	public void login(int i) {// 1 param
		System.out.println(i);
	}

	public void login(int i, int p) {// 2 params

	}

	public void login(int i, String p) {// 2 params
		System.out.println(i + p);
	}

	public void login(String i, int p) {// 2 params

	}

	// login:
	public void doLogin(String un, String pwd) {

	}

	public void doLogin(String un, String pwd, String role) {

	}

	public void doLogin(String un, long ph) {

	}

	public void doLogin(String un, String pwd, long ph, int otp) {

	}

	public void doLogin() {

	}

	// search
	public void search() {

	}

	public void search(String name) {

	}

	public void search(String name, int price) {

	}

	public void search(String name, int price, String seller) {

	}

	public void search(String color, String name, int price) {

	}

	// car booking:
	public void carBooking(String type) {

	}

	public void carBooking(String type, String from, String to) {

	}

	public void carBooking(String type, String from, String to, String pool) {

	}

	// payment:
	public void payment(String cc, String pwd) {

	}

	public void payment(String cc, String pwd, int otp) {

	}

	public void payment(String upi) {

	}

	public static void main(String[] args) {

		AmazonApp a1 = new AmazonApp();
		a1.login(10, "naveen");
		

	}

}
