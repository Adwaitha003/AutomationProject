package tests;


import org.testng.annotations.Test;

import baseclass.bclass;
import pages.addtocart;
import pages.loginpage;
import pages.registrationpage;
import pages.signin;


public class glammmytest extends bclass{

	
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
		cart.purchase();
		
	}
}
