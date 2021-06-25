package WebDriverArch;

public class GoogleTest {
	
	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "chrome";
		//cross browser :
		
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browser.equals("safari")) {
			driver = new SafariDriver();
		}
		else {
			System.out.println("please pass the right browser.....");
		}
		
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("some title")) {
			System.out.println("PASS");
		}
		
		driver.findElement("search");
		driver.sendKeys("naveen automation labs");
		driver.click("submit");
		driver.close();
		
	}

}
