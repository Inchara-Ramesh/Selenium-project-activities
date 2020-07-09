package suitecrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
         WebDriver driver ;
         public static void main(String[] args) {
     		System.setProperty("webdriver.gecko.driver","C:\\Users\\IncharaRamesh\\java installers\\drivers\\geckodriver\\geckodriver.exe");
     		WebDriver driver =new FirefoxDriver();
     		driver.get("http://alchemy.hguy.co/crm");
     		System.out.println(driver.getTitle().contentEquals("SuiteCRM"));
     		if (driver.getTitle().contentEquals("SuiteCRM") == true)
     		{
     			System.out.println("The tile is matched with expected title");
     			driver.close();
     		}
         }
}