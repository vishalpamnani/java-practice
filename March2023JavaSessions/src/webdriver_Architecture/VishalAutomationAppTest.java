package webdriver_Architecture;

public class VishalAutomationAppTest {
	static WebDriver driver;

	public static void main(String[] args) {
		
		//chrome:
		//ChromeDriver driver = new ChromeDriver(); 
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		//SafariDriver driver = new SafariDriver();
		
		String browser = "safari";
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		else {
			System.out.println("Invalid Browser; Please pass the correct browser name.");
		}
		
		
		
		
		driver.get("https://www.pamnanivishal.com");
		
		String actualTitle = driver.getTitle();
		System.out.println("Your page title is: "+actualTitle);
		
		if(actualTitle.equals("Vishal Software Test Architect")) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Title is incorrect");
		}
		
		driver.sendKeys("emailID", "vishal1@gmail.com");
		driver.sendKeys("password", "Vishal@123");
		driver.click("loginButton");
		
		driver.close();

	}

}
