import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.io.FileHandler;
public class NewWindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//window switch
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentWindowId=it.next();
		String childWindowId=it.next();
		driver.switchTo().window(childWindowId);
		driver.get("https://rahulshettyacademy.com");
		String courseName=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(parentWindowId);
		WebElement name=driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(courseName);
		//screenshot
		File file=name.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("D://name.png"));
		
		//height and width
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
	}

}
