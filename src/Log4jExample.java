import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Log4jExample {
	private static WebDriver driver;
	//to log in a file
	public static Logger log = Logger.getLogger("devpinoyLogger");
	
	 public static void openGmail() {
		  System.setProperty("webdriver.firefox.marionette","C:\\Users\\soumya.billava\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		 
		  driver=new FirefoxDriver();
		  
		  log.info("opened firefox browser");
		 
		  driver.manage().window().maximize();
		 
		  log.info("maximized the window");
		  
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  			 
		  driver.get("https://www.gmail.com");  
		 
		  log.info("opened gmail in the  browser");
	  }
	 
	 public static void login() {
		 log.debug("Entering Uersname");
		 
	      driver.findElement(By.id("Email")).sendKeys("soumya.billava@sagarsoft.in");
	 
	      driver.findElement(By.id("next")).click();
	      
	      log.debug("Entering Password");
	      
	      log.info("entered username");
	      
	      driver.findElement(By.id("Passwd")).sendKeys("India_123$");
	 
	      driver.findElement(By.id("signIn")).click();
	      
	      log.info("entered password");
	      
	      log.warn("exiting method login");
		  
	  }

	public static void main(String args[])
	{
		log.debug("Calling openGmail method");
		
		openGmail();
		
		log.debug("Calling login method");
		
		login();
		
		System.out.println("Done");
	}
}
