package Non_Function_Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Check_Title {
  @Test
  public void Title() {
	  
		System.setProperty("webdriver.chrome.driver", "/Users/itviec/SeleniumDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
	    String expectedTitle = "ITviec | Top IT Jobs for You";
	    String actualTitle = "";
        String baseUrl = "https://itviec.com";


        driver.get(baseUrl);
        //Get the actual value of the title
        actualTitle = driver.getTitle();
        
        try {
            assertEquals(actualTitle, expectedTitle);
		} catch (Exception e) {
			// TODO: handle exception
	        driver.close();
		}
        if (actualTitle.contentEquals(expectedTitle)){
           System.out.println("Title Match");
        } else {
            System.out.println("Title Not Match");
        }
        driver.close();
       
  }
 
}
