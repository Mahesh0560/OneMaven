package OneOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WithClass {

	

	 public WebDriver driver;
	 
	  @Test(invocationCount=4)
	  public void openMyBlog() {
	 driver.get("https://www.softwaretestingmaterial.com/");
	 driver.manage().window().maximize();
		WebElement mainTab = driver.findElement(By.xpath("//div/ul/li/a[@itemprop='url']/span[contains(text(),'Tutorials')]"));
		WebElement subTab = driver.findElement(By.xpath("(//div/ul/li/ul/li/a[@itemprop='url']/span[contains(text(),'Selenium')])[1]"));
		WebElement subTab2 = driver.findElement(By.xpath("//div/ul/li/ul/li/ul/li/a[@itemprop='url']/span[contains(text(),'TestNG')]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(mainTab);
		
		action.moveToElement(subTab);
		 WebElement ele = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("menu-item-4207")));
		action.moveToElement(subTab2).click().build().perform();
		
		
		
	  }
	  
	  
	  
	  
	  @BeforeMethod
	  public void beforeMethod() {
	   
		System.out.println("Before method calling");
		 
		   System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jar new\\chromedriver.exe");
		   driver = new ChromeDriver();
	}
	  
	 /* @AfterMethod
	  public void AfterMethod(){
		 driver.quit(); 
	  }*/
	 
//dfsdfstgs v re regt gdtgrthrht 
	  
}
