package Robot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo04 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.Bluestone.com");
		driver.findElement(By.xpath("//div[@class='lc-1x7wur2 e1dmt1bi0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
}
}