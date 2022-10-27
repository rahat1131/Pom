package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Model.GmailSignUpModel;

public class GmailSignUpPage extends GmailSignUpModel {

	public GmailSignUpPage(WebDriver a) {
		super(a);
	}
	public void typefirstnameonbox() throws InterruptedException {
		
		WebElement g = typefirstname();
		
		g.sendKeys("rahat");
}
}