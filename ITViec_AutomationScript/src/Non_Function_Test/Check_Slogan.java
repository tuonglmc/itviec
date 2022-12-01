package Non_Function_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Check_Slogan {

  @Test
  public void Slogan() {
	  
	  //dd
	  
	    System.setProperty("webdriver.chrome.driver", "/Users/itviec/SeleniumDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://itviec.com";
		
		driver.get(baseUrl);
		
		String txt_Slogan =  driver.findElement(By.className("slogan")).getText();
	
		System.out.println(txt_Slogan);
		Assert.assertTrue(txt_Slogan.contains("IT Jobs For \"Chất\" Developers"));
		
	  System.out.println("snc");
		driver.close();
  }
}
