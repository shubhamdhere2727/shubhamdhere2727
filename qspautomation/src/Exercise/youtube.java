package Exercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {

	public static void main(String[] args) {
			 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			    WebDriver driver=new ChromeDriver();
			    driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			    driver.get("https:www.youtube.com");
                driver.findElement(By.id("video-title")).click();
                driver.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button']")).click();
	}

}
