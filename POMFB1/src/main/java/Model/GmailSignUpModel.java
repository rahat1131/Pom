package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailSignUpModel extends BaseModel {

	public GmailSignUpModel(WebDriver a) {
	super (a);}
	
	public WebElement typefirstname() throws InterruptedException {
		Thread.sleep(4000);
		WebElement tfn = driver.findElement(By.xpath("//input[@aria-label='First name']"));
		return tfn;
		
	
}
}