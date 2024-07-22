import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String optionValue=driver.findElement(By.id("checkBoxOption2")).getText();
		WebElement staticDropdown=driver.findElement(By.id("dropdown-class-example"));
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByValue(optionValue);
		driver.findElement(By.id("name")).sendKeys(optionValue);
		driver.findElement(By.id("alertbtn")).click();

	}

}
