package test;

//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	
	
	 @BeforeMethod
	
	public void bfmethod() {
		
		System.out.println("before methods");
		
	}
	
	@Parameters({"URL"})
    @Test
	public void basic4(String come) {
		// TODO Auto-generated method stub
  System.out.println("tree");
  System.out.println(come);
	}

    @BeforeClass
    public void bfclass() {
    	System.out.println("before class comes after suite");
    	
    }
   
    
    @BeforeTest(groups={"smoke"})
    public void first() {
    	
    	System.out.println("will execute first");	
    	
    }
    
}
