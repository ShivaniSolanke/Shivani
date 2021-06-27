package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	    
		@FindBy(xpath="//input[@type='email']")
		private WebElement email;
		
		@FindBy(xpath="//input[@id='continue']")
		private WebElement continues;
		
		@FindBy(xpath="//input[@type='password']")
		private WebElement password;
		
		@FindBy(xpath="//input[@id='signInSubmit']")
		private WebElement submit;
		
		@FindBy(xpath="//input[@name='password']")
		private WebElement pass1;
		
		@FindBy(xpath="//input[@id='signInSubmit']")
		private WebElement Submit1;
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void email() {
			email.sendKeys("Shubhamrathod9823@gmail.com");
		}
		
		public void continues() {
			continues.click();
		}
		public void password() {
			password.sendKeys("Shubham@123");
		}
		public void submit() {
			submit.click();
		}	
		public void pass() {
			pass1.sendKeys("Shubham@123");
		}
        public void sub() {
        	Submit1.click();
        }
}
