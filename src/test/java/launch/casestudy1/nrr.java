package launch.casestudy1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class nrr {
	@Given("user directly search by typing {string}")
	public void user_directly_search_by_typing(String str) {
		WebDriver driver;
		{
			System.setProperty("webdriver.chrome.driver","C:\\New folder\\download\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
			driver.findElement(By.id("myInput")).sendKeys(str);
			driver.findElement(By.cssSelector("body > div.col-md-12.col-sm-12.col-xs-12 > form > input[type=submit]")).click();
			driver.findElement(By.cssSelector("body > section > div > div > div.col-sm-9 > div > div > div > div:nth-child(3) > center > a")).click();
		   
	   
	}}

	@Then("the page is redirected to the login page")
	public void the_page_is_redirected_to_the_login_page() {
		System.out.println("login page is displayed");
	   
	}
	}

