package OOP_Encapsulation;

public class BrowserLaunch {

	public static void main(String[] args) {

		Browser br = new Browser();
		br.launchBrowser();

		Login lp = new Login();
		lp.setUsername("admin");
		lp.setPassword("admin");

		lp.doLogin(lp.getUsername(), lp.getPassword());

		// seller:
		Login lp1 = new Login();
		lp1.setUsername("seller");
		lp1.setPassword("seller123");
		lp1.doLogin(lp1.getUsername(), lp1.getPassword(), 1234);

		for(int i=0; i<=4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i <= 4; i++) {
			for (int j = 4; j >i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
