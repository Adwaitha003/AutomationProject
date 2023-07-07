package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addtocart {
	WebDriver driver;
	By women= By.xpath("//a[@href='https://www.glamly.com/collections/women']");
	By tops =By.xpath("//div[@data-page='1']");
	By bag=By.xpath("//span[@id='AddToCartText']");
	public addtocart(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void shoping() {
		driver.findElement(women).click();
	}
	public void clothes() {
		driver.findElement(tops).click();
	}
	public void purchase() {
		driver.findElement(bag).click();
	}
	}



