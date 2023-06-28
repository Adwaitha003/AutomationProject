package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	WebDriver driver;
	By Account=By.xpath("//div[@class='myaccount-title dropdown-toggle label-header']");
	By login=By.xpath("//*[@id=\"_desktop_account_list\"]/div/div/div[1]/a");
	By gemail=By.name("customer[email]");
	By gpassword=By.name("customer[password]");
	By glogin=By.xpath("//*[@id=\"customer_login\"]/div[3]/div[6]/input");

	public loginpage(WebDriver driver) {
		this.driver=driver;	
	
	}
	public void sg() {
		driver.findElement(Account).click();
	}
	public void log() {
		driver.findElement(login).click();
	}
	public void setValues(String email,String password)
	{
		
		driver.findElement(gemail).sendKeys(email);
		driver.findElement(gpassword).sendKeys(password);
	}
	
		public void signIn() {
			driver.findElement(glogin).click();
	
}}



