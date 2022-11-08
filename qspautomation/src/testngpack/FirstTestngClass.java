package testngpack;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestngClass {
@Test
public void method1()
{
	Reporter.log("method1 executed",true);
}

public void method2()
{
Reporter.log("method2 executed",true);	
}

@Test
public void method3()
{
	int a=9;
	int b=0;
	int res=a/b;
	System.out.println(res);
	Reporter.log("method3 executed",true);
}
@Test
public void method4()
{
	Reporter.log("method4 executed", true);
}
@Test
public void method5()
{
  Reporter.log("method5 executed", true);
}
}

