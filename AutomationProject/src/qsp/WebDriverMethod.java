package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Vijay Kumar P\\eclipse-workspace\\AutomationProject\\Drivers\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("http://www.google.com/");
   String pageUrl = driver.getCurrentUrl();
   System.out.println(pageUrl);
   
   driver.get("C:/Users/Vijay%20Kumar%20P/OneDrive/Desktop/user%20login/index.html");
   System.out.println(driver.getPageSource());
   
   driver.get("https)://www.facebook.com/");
   //System.out.println(driver.getTitle());
   String expectedTitle = "Facebook - login or signup";
   String actualTitle = driver.getTitle();
   if(actualTitle.equals(expectedTitle))
   {
	   System.out.println("Facebook  login page is Displayed, PASS"); 
   }
	   
	 
	}

}
