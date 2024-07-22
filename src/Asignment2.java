import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Asignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//input[@minlength='2']")).sendKeys("Sukaji Parab");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sukajiparab@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("sukajiparab");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement staticDropdown=driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByVisibleText("Male");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("09-12-1999");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		
	}

}
