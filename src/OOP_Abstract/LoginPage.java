package OOP_Abstract;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("LoginPage const....");
	}

	@Override
	public void title() {
		System.out.println("LP - title");
	}

	@Override
	public void header() {
		System.out.println("LP - header");
	}
	
	public void doLogin() {
		System.out.println("login to app....");
	}

}
