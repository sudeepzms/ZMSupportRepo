 package cpom.zeromass.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import cpom.zeromass.pages.LandingPage;

public class ComplaintPage {	
		
	private WebDriver driver;

	@FindBy(id = "koinput")
	private WebElement enterCspCode;
	
	@FindBy(xpath = "//span[@id='koidmsg']")
	private WebElement incCspMsgWE;	
	String actualMsg;
	
//	@FindBy(xpath = )
//	private WebElement inVCspMsgWE;
	
	@FindBy(id = "submit")
	private WebElement cmpSubBtn;
	
	@FindBy(id = "myCat")
	private WebElement selectCategory;
	
	@FindBy(id = "subCategory")
	private WebElement selectSubCategory;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Description(max. 900 characters)']")
	private WebElement cmpDescription;

	
	
	
//==================================================== PageFactory:::::::::::::::::::::::::::
public ComplaintPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
//=======================================================================================	
	public void enterCspid(String CspID) {
		enterCspCode.sendKeys(CspID);		
	}
	
	public void checkValidation() {
		cmpSubBtn.click();
		Alert alert = driver.switchTo().alert(); //Switching on Alert Popup
       	String alertMsg = alert.getText(); 		//Capturing Alert Message
       	System.out.println(alertMsg);
       	alert.accept();
	}
	
	public void selectCategory(String categ ) {
		Select itemCat = new Select(selectCategory);
		itemCat.selectByVisibleText(categ);	
	}
	
	public void selectSubCategory(String subCateg) {
		Select itemSubCat = new Select(selectSubCategory);
		itemSubCat.selectByVisibleText(subCateg);
	}
	
	public void compDescription(String cmpDescrptn) {
		cmpDescription.sendKeys(cmpDescrptn);
		System.out.println(cmpDescrptn);
	}
	
	public void doComplaint(String CorCode, String caTegory, String subcategory, String cmpdescrption) throws InterruptedException 
	{		
	this.enterCspid(CorCode);
	this.selectCategory.click();
	Thread.sleep(1000);
	 actualMsg = incCspMsgWE.getText();
	System.out.println(":::::::::::::::::::::::::::::::::::"+actualMsg);
	//CheckValidationBySubmitBtn.checkValidation(cmpSubBtn);
	System.out.println("Helooooo1"+caTegory);
	System.out.println("Helooooo1"+subcategory);		
	this.selectCategory(caTegory);		
	Thread.sleep(1000);	
	this.selectSubCategory(subcategory);
	this.compDescription(cmpdescrption);  
//	LandingPage lp = new LandingPage();
//	lp.clickVisitLink();
		}
//public String getActual()
//{
//	return actualMsg;
//	}
	public String ValidMsg()
	{
		return actualMsg;
	}
	
}

