package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.addtocart;
import pages.loginpage;
import pages.registrationpage;
import pages.signin;


public class glammmytest {

	WebDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.glamly.com/collections/women-dress?utm_source=cpc&utm_medium=google&utm_campaign=performance-max-18403529725&gclid=CjwKCAjws7WkBhBFEiwAIi168wz5BgK3OCrlx3EABTfw--_s-tcfuqWT-40tDhv6tEI3vspTYZbEaxoC19cQAvD_BwE");
	}
	@Test
	public void glammyytestt() 
	{
	    signin ob = new signin(driver);
	    ob.signinn();
		ob.registeraccount();
		
		registrationpage register =new registrationpage(driver);
		register.Fname();
		register.Lname();
		register.setValues("Adwaitha","Chandran","adwaithac3@gmail.com","hello123@");
		register.check();
		register.Rbtn();
		
		
		loginpage ob1=new loginpage(driver);
		ob1.sg();
		ob1.log();
		ob1.setValues("adwaithac3@gmail.com", "hello123@");
		ob1.signIn();
		
		addtocart cart =new addtocart(driver);
		cart.shoping();
		cart.clothes();
		cart.closetab();
		
	}
}
