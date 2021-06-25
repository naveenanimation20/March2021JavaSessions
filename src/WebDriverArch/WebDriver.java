package WebDriverArch;

public interface WebDriver extends SearchContext{
	
	public void get(String url);
	
	public String getTitle();
	
	public void close();
	
	public void maximize();
	
	public void click(String element);
	
	public void sendKeys(String value);
	
	@Override
	public void findElement(String element);
	
	@Override
	public void findElements(String element);
	
	
}
 