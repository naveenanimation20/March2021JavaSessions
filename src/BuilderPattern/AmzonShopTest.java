package BuilderPattern;

public class AmzonShopTest {

	public static void main(String[] args) {

		EcommApp ecomm = new EcommApp();
		
		
		ecomm.login("naveen@gmail.com", "test123")
					.search("MAcbook Pro")
						.addToCart("MAcbook Pro")
							.checkout("MAcbook Pro")
								.doPayment("12121 1212 2121 2121", "test234")
									.logout();
			
		
		ecomm.login().doPayment("test@gpay").logout();
		
		ecomm.login().addToCart("iMac").logout();
		
		ecomm.login().logout();
		
		ecomm.logout();
		
	}

}
