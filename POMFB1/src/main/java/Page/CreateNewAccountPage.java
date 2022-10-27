package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Model.CreateNewPageModel;

public class CreateNewAccountPage extends CreateNewPageModel {

	public CreateNewAccountPage(WebDriver a) {
		super(a);
	}
public void typefirstnameonbox() throws InterruptedException {
	
	WebElement f = typefirstname();
	
	f.sendKeys("rahat");
	
}
}