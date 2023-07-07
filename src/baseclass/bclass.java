package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class bclass {
	protected WebDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.glamly.com/collections/women-dress?utm_source=cpc&utm_medium=google&utm_campaign=performance-max-18403529725&gclid=CjwKCAjws7WkBhBFEiwAIi168wz5BgK3OCrlx3EABTfw--_s-tcfuqWT-40tDhv6tEI3vspTYZbEaxoC19cQAvD_BwE");
	
	}
}
