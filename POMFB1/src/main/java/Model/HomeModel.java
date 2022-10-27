package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeModel extends BaseModel {

	public HomeModel(WebDriver a) {
		super(a);
		
		
		
		
		
	}

	public WebElement getcreatenewaccountbutton() {
	
		WebElement cna = driver.findElement(By.xpath("//*[text()='Create new account']"));
		
		return cna;

	
	
	
	}	
}
