package Test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class WFH {
WebDriver driver = null;
  @Test
  public void Test() {
	  driver.get("https://demoqa.com/alerts");
  }
  
  @BeforeSuite
  public void beforeSuite() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
  }

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }

}
