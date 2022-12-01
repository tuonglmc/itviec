package Non_Function_Test;


import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Check_MenuElements {
  @Test
  public void MenuElements() {
	  
	  	System.setProperty("webdriver.chrome.driver", "/Users/itviec/SeleniumDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://itviec.com");
		
//		WebElement txtAllJob = driver.findElement(By.linkText("All Jobs"));
//		WebElement txtITCompanies = driver.findElement(ByName.name("IT Companies"));
		
		driver.close();
  }

}