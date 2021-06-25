package WebDriverArch;

public class SafariDriver implements WebDriver{
	
	public SafariDriver() {
		System.out.println("launch Safari browser");
	}
	
	@Override
	public void get(String url) {
		System.out.println("enter the url : " + url);
	}

	@Override
	public String getTitle() {
		return "some title";
	}

	@Override
	public void close() {
		System.out.println("close the browser");
	}

	@Override
	public void maximize() {
		System.out.println("maximize the window");

	}

	@Override
	public void click(String element) {
		System.out.println("clicking on element : " + element);
	}

	@Override
	public void sendKeys(String value) {
		System.out.println("pass the value to element : " + value);

	}

	@Override
	public void findElement(String element) {
		System.out.println("find the element: " + element);
	}

	@Override
	public void findElements(String element) {
		System.out.println("find the elements: " + element);

	}

}
