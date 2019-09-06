package launch.casestudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class nonrun {
	WebDriver driver;
	@Given("the browser is launched")
	public void the_browser_is_launched() {
		
		 System.setProperty("webdriver.chrome.driver","C:\\New folder\\download\\chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/");
		  driver.findElement(By.cssSelector("#header > div:nth-child(1) > div > div > div.col-sm-8 > div > ul > li:nth-child(2) > a")).click();
	  
	}
	@When("the user {string}")
	public void the_user(String a) {
		driver.findElement(By.id("userName")).sendKeys(a);
	}
	@When("he enters his first {string}")
	public void he_enters_his_first(String b) {
		driver.findElement(By.id("firstName")).sendKeys(b);
	}

	@When("he enters his last{string}")
	public void he_enters_his_last(String c) {
		driver.findElement(By.id("lastName")).sendKeys(c);
	}

	@When("he enters his pass{string}")
	public void he_enters_his_pass(String d) {
		 driver.findElement(By.id("password")).sendKeys(d);
	}

	@When("he enters his confirmpass{string}")
	public void he_enters_his_confirmpass(String e) {
		driver.findElement(By.id("pass_confirmation")).sendKeys(e);
	}

	@When("he enters his gend{string}")
	public void he_enters_his_gend(String f) {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/span[1]")).click();
	}

	@When("he enters his email{string}")
	public void he_enters_his_email(String g) {
		driver.findElement(By.id("emailAddress")).sendKeys(g);
	}

	@When("he enters his cont{string}")
	public void he_enters_his_cont(String h) {
		 driver.findElement(By.id("mobileNumber")).sendKeys(h);
	   
	}

	@When("he enters his dob{string}")
	public void he_enters_his_dob(String i) {
		driver.findElement(By.id("dob")).sendKeys(i);
		
	}

	@When("he enters his add{string}")
	public void he_enters_his_add(String j) {
		driver.findElement(By.id("address")).sendKeys(j);
		
	}

	@When("he enters his sec{string}")
	public void he_enters_his_sec(String k) {
		driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]/option[2]")).click();
		
	}

	@When("he enters his ans{string}")
	public void he_enters_his_ans(String l) {
		driver.findElement(By.id("answer")).sendKeys(l);
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	}
	@Given("Login page is displayed")
	public void login_page_is_displayed() {
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\download\\chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	   
	}

	@When("i enter the {string}")
	public void i_enter_the(String m) {
		driver.findElement(By.id("userName")).sendKeys(m);
	}

	@When("i enter the user{string}")
	public void i_enter_the_user(String n) {
		driver.findElement(By.id("password")).sendKeys(n);
	}

	@Then("clicks on the Login button")
	public void clicks_on_the_Login_button() {
		driver.findElement(By.name("Login")).click();
	}

	@Then("user successfully logged in")
	public void user_successfully_logged_in() {
	    
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	