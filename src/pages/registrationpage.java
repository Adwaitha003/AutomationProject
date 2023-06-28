package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registrationpage {
	WebDriver driver;
	By firstname= By.name("customer[first_name]");
	By lastname = By.name("customer[last_name]");
	By glammemail =By.name("customer[email]");
	By glammpassword= By.name("customer[password]");
	By checkbox=By.name("newsletter");
	By register=By.xpath("//input[@class='btn']");

		public registrationpage(WebDriver driver)//to get browser details
		{
		this.driver=driver;	
		}
		public void Fname()
		{
			driver.findElement(firstname).click();
		}
		public void Lname()
		{
			driver.findElement(lastname).click();
		}
		public void setValues(String fname,String lname,String email,String password)
		{
			driver.findElement(firstname).sendKeys(fname);
			driver.findElement(lastname).sendKeys(lname);
			driver.findElement(glammemail).sendKeys(email);
			driver.findElement(glammpassword).sendKeys(password);
			
		}
		
		public void check() {
			driver.findElement(checkbox).click();;
		}
		public void Rbtn()
		{
			driver.findElement(register).click();
		}
	}



