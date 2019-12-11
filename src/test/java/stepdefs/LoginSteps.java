package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSteps {

WebDriver driver;


public LoginSteps()

{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4a.05.26\\Desktop\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	
}

@Given("^user is on login page")

public void user_is_on_login_page() throws Throwable {
	
	driver.get("https://www.phptravels.net/admin");
	
}

@When("^user enters valid email")

public void user_enters_valid_email() throws Throwable {
	
	driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
	
	
}

@When("^user enters valid password")

public void user_enters_valid_password() throws Throwable {

driver.findElement(By.name("password")).sendKeys("demoadmin");

driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(10000);
}


@Then ("^ user is logged in successfully")

public void user_is_logged_in_successfully() throws Throwable{
	
	Assert.assertEquals("Dashboard", driver.getTitle());
	
	driver.close();
	
}

}
