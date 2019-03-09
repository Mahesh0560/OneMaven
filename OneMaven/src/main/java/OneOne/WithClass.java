package OneOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WithClass {

	

	 public WebDriver driver;
	 
	  @Test
	  public void openMyBlog() {
	 driver.get("https://www.softwaretestingmaterial.com/");
	 driver.manage().window().maximize();
		WebElement mainTab = driver.findElement(By.xpath("//div/ul/li/a[@itemprop='url']/span[contains(text(),'Tutorials')]"));
		WebElement subTab = driver.findElement(By.xpath("(//div/ul/li/ul/li/a[@itemprop='url']/span[contains(text(),'Selenium')])[1]"));
		WebElement subTab2 = driver.findElement(By.xpath("//div/ul/li/ul/li/ul/li/a[@itemprop='url']/span[contains(text(),'TestNG')]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(mainTab);
		action.moveToElement(subTab);
		action.moveToElement(subTab2).click().build().perform();
	  }
	  
	  
	  
	  
	  @BeforeClass
	  public void beforeClass() {
	   
	   System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Drivers\\geckodriver.exe");
	   driver = new FirefoxDriver();
	   
	  }
	 
	  @AfterClass
	  public void afterClass() {
	   driver.quit();
	  }

	  
}
