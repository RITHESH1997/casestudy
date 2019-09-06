package launch.casestudy1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class weblauncher {
	
	WebDriver driver;
	public void f() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\New folder\\download\\chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/");
	}

}
