import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.cssSelector(".table-display tr")).size());
		System.out.println(driver.findElements(By.cssSelector(".table-display th")).size());
		System.out.println(driver.findElement(By.xpath("//body[1]/div[3]/div[1]/fieldset[1]/table[1]/tbody[1]/tr[4]/td[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//body[1]/div[3]/div[1]/fieldset[1]/table[1]/tbody[1]/tr[4]/td[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//body[1]/div[3]/div[1]/fieldset[1]/table[1]/tbody[1]/tr[4]/td[3]")).getText());
	
	}

}
