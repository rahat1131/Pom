package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Model.HomeModel;

public class HomePage extends HomeModel{

	public HomePage(WebDriver a) {
		super(a);
	}
public void ClickOnAccount() {
	
	WebElement e = getcreatenewaccountbutton();
	
	
	e.click();
	
	
}
}