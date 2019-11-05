package test;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class jklogin {

	
	
	
	@Test(dataProvider="getdata")
	public void login(String username,String password) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\muthusaravanan.m\\Downloads\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
		File file = new File("D:\\Testing\\jk.properties");
		  
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		
		//load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}  
		
		driver.get("http://192.168.26.231:8080/login_demo/Login_Demo/");
		driver.findElement(By.xpath("//input[@id='Uname']")).sendKeys(prop.getProperty(username));
		driver.findElement(By.xpath("//input[@id='Pword']")).sendKeys(prop.getProperty(password));
		driver.findElement(By.xpath("//button[@type='button']")).click();
		String d=driver.getTitle();
		System.out.println(d);
		assertEquals(d,d);
		
		
	}
	
	
	
	@DataProvider
	public Object[][] getdata() {
		
		Object[][] data=new Object[2][2];
		data[0][0] = "username";
	    data[0][1] = "password";
		data[1][0] = "username1";
		data[1][1] = "password1";
		return data;
		
		
	}
}
