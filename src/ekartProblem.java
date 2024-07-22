import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ekartProblem {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(5));
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot","Brinjal"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addItems(driver,itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		w.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		 }
public static void addItems(WebDriver driver,String[] itemsNeeded) {
	int count=0;
	List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
	 for(int i=0;i<products.size();i++) {
		String name= products.get(i).getText().split("-")[0].trim();
		
		List itemsNeededList=Arrays.asList(itemsNeeded);
		
		if (itemsNeededList.contains(name)) {
			count++;
			driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
			
			if(count==4) {
				break;
			}
		}
		}
}
	}


