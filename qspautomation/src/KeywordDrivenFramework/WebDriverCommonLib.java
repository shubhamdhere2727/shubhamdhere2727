package KeywordDrivenFramework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebDriverCommonLib extends BaseTest {

    //get all options
	public void getAllOptionsOfDropdown(WebElement element)
	{
		Select sel = new Select(element);
		List<WebElement> allOps = sel.getOptions();
		for(WebElement op:allOps)
		{
			String textOfOption = op.getText();
			System.out.println(textOfOption);
		}
		
	}	
	//perform Right click
   public void rightclick(WebElement target)
   {
	   Actions act = new Actions(driver);
	   act.contextClick(target).perform();  
   }
	
   //perform mousehover action
	public void doubleclick(WebElement target)
	{
		Actions act = new Actions(driver);
		   act.doubleClick(target).perform();  
	}
	
	//to perform copy
	public void CopyText() throws AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	public void pasteText() throws AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	//take the screenshot
	
	public void takeTheScreenShot(String folder,String screenShotName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./"+folder+"/"+screenShotName+".jpg");
		Files.copy(src,dest);
	}
	
	
	//scrollDown
	
	public void scrollDown(int y)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+y+")");
		
	}
	
	//scrollUp
	
	public void scrollUp(int y)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+(-y)+")");
		
	}
	
}
