package webdriver_Architecture;

public class ChromeDriver implements WebDriver {

	public ChromeDriver() {
		System.out.println("Chrome is launched!");
	}

	@Override
	public void findElement(String element) {
		System.out.println("Find element: " + element);
	}

	@Override
	public void get(String url) {
		System.out.println("Enter URL: " + url);
	}

	@Override
	public String getTitle() {
		System.out.println("Getting the page title!");
		return "Vishal Software Test Architect";
	}

	@Override
	public void click(String element) {
		System.out.println("Clicking on element: " + element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("Entering value: " + value + " into " + element);
	}

	@Override
	public void close() {
		System.out.println("Close Browser");
	}

}
