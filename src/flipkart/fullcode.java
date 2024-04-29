package flipkart;

import java.util.Set;

import org.apache.commons.math3.ode.events.Action;
import org.bouncycastle.util.Arrays.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fullcode {

	public static <string> void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement search=driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
	search.sendKeys("shirts");
    Actions act=new Actions (driver);
    search.sendKeys(Keys.ENTER);
    Thread.sleep(3000);
    JavascriptExecutor js=(JavascriptExecutor)driver;
    //js.executeScript("window.scrollBy(0,700)");
    //WebElement shirt = driver.findElement(By.xpath("//a[text()='Men Slim Fit Checkered Spread Collar Casual Shirt'])[3]"));
    //JavascriptExecutor js=(JavascriptExecutor)driver;
    //js.executeScript("arguments[0],scrollIntoView()",shirt);
    //shirt.click();
    WebElement ele=driver.findElement(By.xpath("//span[text()='Electronics']"));
    act.moveToElement(ele).build().perform();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[@title='Apple']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Starlight, 128 GB)']")).click();
    Set<String> wid=driver.getWindowHandles();
    System.out.println("wid=" +wid);
    java.util.Iterator<String> itr=wid.iterator();
    String mainwid= itr.next();
    String cwid=itr.next();
    driver.switchTo().window(cwid);
    Thread.sleep(2000);
    WebElement jeans=driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
    jeans.sendKeys("jeans");
    Thread.sleep(2000);
    jeans.clear();
    Thread.sleep(2000);
    driver.switchTo().window(mainwid);
    WebElement login=driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
    act.moveToElement(login).build().perform();
    login.sendKeys(Keys.ENTER);
    driver.switchTo().window(cwid);
    JavascriptExecutor je=(JavascriptExecutor) driver;
    Thread.sleep(2000);
    je.executeScript("window.scrollBy(0,500)");
    driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
    Thread.sleep(2000);
    driver.navigate().back();
    WebElement logo=driver.findElement(By.xpath("//img[@title='Flipkart']"));
    boolean dispay=logo.isDisplayed();
    System.out.println("logo is Dispalyed" +dispay );
    System.out.println("updated in local repo");
  
	

	}

}
