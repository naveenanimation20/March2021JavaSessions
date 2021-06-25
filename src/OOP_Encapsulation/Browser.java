package OOP_Encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("trying to launch browser");
		checkVersion();
		checkOSCompatible();
		checkRAMSpace();
		checkHardWare();
		System.out.println("browser is launched");
	}

	private void checkVersion() {
		System.out.println("check version");
	}

	private void checkOSCompatible() {
		System.out.println("checkOSCompatible");
	}

	private void checkRAMSpace() {
		System.out.println("RAM IS available");
	}

	private void checkHardWare() {
		System.out.println("checkHardWare");
	}

}
