package Robot;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo3 {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.flipkart.com");
			Thread.sleep(8000);
			driver.findElement(By.xpath("//button[.='✕']")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("q")).sendKeys("iphone12");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
			String parenthandle = driver.getWindowHandle();
			Set<String> alltabs = driver.getWindowHandles();
			for(String tab:alltabs)
			{
				if(!parenthandle.equals(tab))
				{
					driver.switchTo().window(tab);
				}
				else
				{
				
				}
			}
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Green']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='256 GB']")).click();
			driver.findElement(By.id("pincodeInputId")).sendKeys("416229");
            			


	}

}
