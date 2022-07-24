package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RuntimePolymorphismInSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		 System.out.println("Hey User, Enter The Browser:");
		 Scanner sc = new Scanner(System.in);
		 String browser = sc.next() ;
		 if(browser.equalsIgnoreCase("chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Vijay Kumar P\\eclipse-workspace\\AutomationProject\\Drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
		 }
		 else if(browser.equalsIgnoreCase("firefox"))
		 {
			 System.setProperty("webdriver.chrome.driver","./Drivers/geckodriver.exe");
			 driver=new FirefoxDriver();
		 }
		 else if(browser.equalsIgnoreCase("edge"))
		 {
			 System.setProperty("webdriver.chrome.driver","./Drivers/msedgedriver.exe");
			 driver=new EdgeDriver();
		 }
         
		 else
		 {
			 System.out.println("Dabba Fellow, Enter Proper browser name");
		 }
		 Thread.sleep(5000);
		 driver.close();
	}
}

