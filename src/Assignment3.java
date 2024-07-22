import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(5));
	
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement staticDropdown=driver.findElement(By.cssSelector(".form-control[data-style='btn-info']"));
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByIndex(0);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-info']")));
		List <WebElement> cartButton= driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		for(int i=0;i<cartButton.size();i++) {
			cartButton.get(i).click();
			
		}
		driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
		

	}

}
