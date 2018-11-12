package stepdefn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefnmethods {


	 WebDriver driver;
	@Given("url to login")
	public void url_to_login() {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://spimail.spi.com"); 
	}

	@When("enter the username")
	public void enter_the_username() throws Exception {
	    driver.findElement(By.id("username")).sendKeys("madni.afroze");
	    Thread.sleep(10000);
	}

	@Then("login to account")
	public void login_to_account() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}


	
	
}
