package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestClass {
	private WebDriver driver;
	private LoginPage LoginPage;
    private HomePage HomePage;

@BeforeClass
public void beforeClass()
{
	System.out.println("Launch the browser & enter amazon url");
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\shivani\\Downloads\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.amazon.in/ap/signin?ie=UTF8&clientContext=258-8977551-3561624&arb=6b7ef455-7cea-438e-9554-69c2020bb26d&openid.pape.max_auth_age=0&use_global_authentication=false&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_AccountFlyout_signout%26signIn%3D1%26useRedirectOnSuccess%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().window().maximize();
}

@BeforeMethod
	public void beforeMethod() throws InterruptedException 
	{
		 LoginPage=new LoginPage(driver);
		 Thread.sleep(2000);
		 LoginPage.email();
		 LoginPage.continues();
		 LoginPage.password();
		 LoginPage.submit();
		 Thread.sleep(2000);
		 LoginPage.pass();
		 LoginPage.sub();
   }
@Test
    public void test() throws InterruptedException
   {
	     HomePage=new HomePage(driver);
	     Thread.sleep(2000);	     
	     HomePage.mobile();
   
   }
@Test
    public void test3() throws InterruptedException	
   {
	     HomePage.rang();
	     Thread.sleep(2000);
   }
@Test
     public void test4() throws InterruptedException {
         HomePage.redme();
	     Thread.sleep(2000);
}
@Test
public void test5() throws InterruptedException {
	     HomePage.Buy();
	     Thread.sleep(2000);
         HomePage.Addres();
   }
@Test
     public void test1() throws InterruptedException {
       
	     Thread.sleep(2000);
         HomePage.cash();
    }

@AfterMethod
     public void afterMethod()
    {
	    HomePage.Account();

	
}
}




