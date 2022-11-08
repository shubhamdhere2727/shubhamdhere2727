//Maximize the child window
package AssignPack;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign04 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Open')]")).click();
		String parentHandle = driver.getWindowHandle();
		
		Set<String> allhandles = driver.getWindowHandles();
		
		for(String handle:allhandles)
		{
			if(!parentHandle.equals(handle))
			{
				driver.switchTo().window(handle);
				driver.manage().window().maximize();	
			}
			else
			{
				
			}
		}	
	}
}
