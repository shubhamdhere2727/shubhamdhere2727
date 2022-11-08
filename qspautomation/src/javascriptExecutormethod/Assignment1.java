package javascriptExecutormethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    driver.get("https://www.amazon.com");
		    WebElement loc = driver.findElement(By.id("nav-packard-glow-loc-icon"));
		    Point location = loc.getLocation();
		    int xaxis = location.getX();
		    int yaxis = location.getY();
		    System.out.println(xaxis);
		    System.out.println(yaxis);
		    JavascriptExecutor jse=(JavascriptExecutor)driver;
		    Thread.sleep(3000);
		    jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-1500)+")");
		    Thread.sleep(3000);

            driver.close();
}
}