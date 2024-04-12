package flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testng_flipkart {
	WebDriver driver;
	@Test
	public void method1(){
		System.out.println("method 1");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
		
	}
	@Test
    public void method2()
    {
      driver.manage().window().maximize();
    }
}
