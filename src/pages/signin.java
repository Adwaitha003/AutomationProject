package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signin {
WebDriver driver;

By signin=By.xpath("//*[@id=\"shopify-section-nov-header\"]/div[2]/header/div[2]/div/div[3]/div[4]/div[1]/span");
By register=By.xpath("//*[@id=\"_desktop_account_list\"]/div/div/div[2]/a/span");

public signin(WebDriver driver)
{
	this.driver=driver;
}

public void signinn() {
	driver.findElement(signin).click();
}
public void registeraccount() {
	driver.findElement(register).click();
}

}

