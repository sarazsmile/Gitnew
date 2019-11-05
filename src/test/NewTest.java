package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Hello World");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Hello World");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Hello World");
  }

}
