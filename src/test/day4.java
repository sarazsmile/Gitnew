package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class day4 {
    @Test
	public  void moblielogin1() {
		// TODO Auto-generated method stub
   System.out.println("logmobilelogin1");
	}
   
 @Test(dataProvider="getdata")
	public void weblogin1(String username,String password) {
	 System.out.println("webmobilelogin1");
	 System.out.println(username);
	 System.out.println(password);
 }
 @Parameters({ "URL" })
 @Test
    public void apilogin1(String red)
 {
	 System.out.println("webapilogin1");
	 System.out.println(red);
 }
 
 @DataProvider
 public Object[][] getdata() {
	 
	 Object[][] data=new Object[3][2];
	 data[0][0] = "username";
	 data[0][1] = "password";
	 data[1][0] = "username1";
	 data[1][1] = "password1";
	 data[2][0] = "username3";
	 data[2][1] = "password3";
	 return data;
	 
	 
 }
 
 
}
