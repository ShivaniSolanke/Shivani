package pomclasses;


	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	public class HomePage {
		Select s;
		Actions a;
		
		@FindBy(xpath="(//a[@data-csa-c-type='link'])[3]")
		private WebElement Mobile;
		
	    @FindBy(xpath="(//input[@type='checkbox'])[5]")
	    private WebElement checkbox;
	    
	    @FindBy(xpath="(//a[@rel='nofollow'])[14]")
	    private WebElement range;
	    
	    @FindBy(xpath="(//img[@class='s-image'])[1]")
	    private WebElement redme;
	    
	    @FindBy(xpath="//input[@id='buy-now-button']")
	    private WebElement Buy;
	    
	    @FindBy(xpath="(//a[@data-action='page-spinner-show'])[1]")
	    private WebElement Address;
	    
	    @FindBy(xpath="//input[@id='pp-eQ4vrF-116']")
	    private WebElement CashonDelivery;
	    
	    @FindBy(xpath="//a[@data-nav-role='signin']")
	    private WebElement Acco;
	    
	    @FindBy(xpath="//a[@id='nav-item-signout']")
	    private WebElement signout;

		private WebDriver driver;
	    
	    public HomePage(WebDriver driver) {
	    	this.driver=driver;
	    	PageFactory.initElements(driver, this);
	    }
		public void mobile() {
			Mobile.click();
		}
	 //   public void checkbox() {
	 //   	 s=new Select(checkbox);
	   // 	 boolean s=checkbox.isSelected();
	    //	 System.out.println(s);
	    	// if(s==true) {
	    		// System.out.println("dont click");
	    	 //}
	    	 //else {
	    		// System.out.println("click");
	    //	 }
	    //}
	    public void rang() {
	    	range.click();
	    }
	    public void redme() {
	    	redme.click();
	    }
	    public void Buy() {
	    	Buy.click();
	    }
	    public void Addres() {
	    	Address.click();
	    }
	    public void cash() {
	    	driver.switchTo().frame((driver.findElement(By.name("ApxSecureIframe"))));
	    	CashonDelivery.click();
	    }
	    public void Account() {
	    	a.moveToElement(Acco).perform();
	    	a.moveToElement(signout).click().build().perform();
	    }
	}
