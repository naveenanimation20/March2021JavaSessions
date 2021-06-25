package javasessions;

public class MethodChaining {

	String name = "chrome";

	public void launchBrowser() {
		System.out.println("trying to launch browser" + name);

		checkVersion();

		System.out.println("br is launched" + name);

	}

	public void checkVersion() {
		System.out.println("check version");

		checkOSCompatible();
	}

	public void checkOSCompatible() {
		System.out.println("checkOSCompatible");

		checkRAMSpace();
	}

	public void checkRAMSpace() {
		System.out.println("RAM IS available");
	}

	public static void t1() {
		
		t2();
		t3();
	}

	public static void t2() {
		t3();
	}

	public static void t3() {
		System.out.println("bye");
	}

	public static void main(String[] args) {

		MethodChaining m1 = new MethodChaining();
		m1.launchBrowser();
		
		MethodChaining.t1();
		
	}

}
