package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import Page.CreateNewAccountPage;
import Page.HomePage;

public class BaseTest {
	//static GmailSignUpPage gsu;
	static CreateNewAccountPage cna;
	static WebDriver driver;
	static HomePage homepage;
	@BeforeSuite
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/rahat/downloads/chromedriver");

		 driver = new ChromeDriver();

		driver.get("http://www.facebook.com");
	}
	
	public void getHomePage() {
		
		homepage = new HomePage(driver);
		
		

}
	
	public void CreateNewAccountPage() {
	
	cna = new CreateNewAccountPage(driver);
	}
	
	//public void GmailSignUpPage() {
	
	//gsu = new GmailSignUpPage(driver);
	
}
