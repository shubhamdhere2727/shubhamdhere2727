package DataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeinvalideLogin {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=52bu9k5qm9jvd");
		
		Flib flib = new Flib();
		int rc = flib.getRowCount("./data/TestDataAct.xlsx","invalidcreds");
		
		for(int i=1;i<=rc;i++)
		{
			String username = Flib.readExceldata("./data/TestDataAct.xlsx","invalidcreds", i,0);
			String password = Flib.readExceldata("./data/TestDataAct.xlsx","invalidcreds", i,1);

			System.out.println(i);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);

		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("username")).clear();
		}

}

}
