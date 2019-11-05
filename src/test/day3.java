package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
    @Test
	public  void mobilelogin() {
		// TODO Auto-generated method stub
   System.out.println("logmobilelogin");
	}
  @Parameters({"URL","username"})  
 @Test
	public void mobileweblogin(String pull,String user) {
	 System.out.println("webmobilelogin");
	 System.out.println(pull);
     System.out.println(user);
  }
 
 @BeforeSuite(groups={"smoke"})
 
 public void bfsuite() {
	 
	 System.out.println("Before suite will be first");
 }
 
 
 
 @Test
    public void apilogin() {
	 System.out.println("webapilogin");
 }
 
}
