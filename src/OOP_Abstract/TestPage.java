package OOP_Abstract;

public class TestPage {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();
		
		lp.title();//overridden
		lp.header();//inherited
		lp.timeOut();//inherited
		lp.doLogin();//individual
		lp.logo();//inherited
		
		//Page p = new Page();
		
		//top casting:
		//child class object can be referred by parent abstract class ref variable:
		Page p = new LoginPage();
		p.title();
		p.header();
		p.timeOut();
		p.logo();		
		
	}

}
