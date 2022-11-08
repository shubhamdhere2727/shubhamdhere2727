package testngpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class anno {
  @Test
  public void test1() {
	  Reporter.log("test 1 method",true);
  }
  @Test
  public void test2() {
	  Reporter.log("test 2 method",true);
  }
  @BeforeMethod
  public void Method2() {	  
	  Reporter.log("beforemethod annotation",true);  
  }
  @BeforeClass
  public void method3() {
	  Reporter.log("beforeclass annotation",true);

  }
  @BeforeTest
  public void method4() {
	  Reporter.log("beforeTest annotation",true); 
  }

}
