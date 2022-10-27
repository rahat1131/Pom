package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateNewPageModel extends BaseModel {

	public CreateNewPageModel(WebDriver a) {
		super(a);
	}

	public WebElement typefirstname() throws InterruptedException {
	Thread.sleep(4000);
	WebElement tfn = driver.findElement(By.xpath("//input[@name='firstname']"));
	
	
	return tfn;
	
    //WebElement tln = driver.findElement(By.xpath("//input[@name='lastname']"));

	//return tln;
	
	
	
	
	
	
	
	}	
}
