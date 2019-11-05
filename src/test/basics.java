package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class basics {
   @Test
	public void basic() {
		// TODO Auto-generated method stub
  System.out.println("milk");
	}
   
   
   @Test(groups={"smoke"})
   public void basic1() {
	   
	   System.out.println("cow");
   } 

   
   @AfterTest
   public void last() {
	   
	   System.out.println("i will be last");
	   
   }
   
}
