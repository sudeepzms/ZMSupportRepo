package cpom.zeromass.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	LandingPage()								//:::::::::::::::::Default Constructor, so that we can create object of it in other class
	{
			}
	
	//@FindBy(driver.getTitle())
	//private String ActuaTItle = driver.getTitle();
	
	@FindBy(xpath = "//span[contains(text(),'Complaints')]")
	private WebElement complaintLink;	
	
	@FindBy(xpath = "//a[contains(text(),'New Complaint')]")
	private WebElement newComplaintLink;
	
	@FindBy(className = "//a[contains(text(),'View Complaint')]")
	private WebElement viewComplaintLink;
	
	//@FindBy(xpath = "//span[contains(text(),'Visits')]")
	//@FindBy(className = "fa fa-address-card")
	@FindBy(className = "logo-lg")
	private WebElement visitLink;
	 
	
	
	@FindBy()
	private WebElement searchByEmployee;
	
	@FindBy()
	private WebElement searchByCspId; 
	
	@FindBy(xpath = "//a[contains(text(),'Enter Visit Details')]")
	private WebElement enterVisitDetailsLink;
	
	@FindBy(xpath = "//a[contains(text(),'View Visit Details')]")
	private WebElement viewVisitdetailsLink;
	
	@FindBy(xpath = "//a[@onclick='logoutValidation()']")
	private WebElement logOut;
	
	
	
												//::::::::::::::::::::DRIVER::::::::::::::::::::	
	private WebDriver driver;
	private WebDriverWait wait;
	
												//:::::::::::::::::::PageFactory:::::::::::::::	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}
	
						//:::::::::::::::::::Clicks on landing page:::::::::::::::::::::::	
												// Complaint Links::::::::::::::::::::::
	public void clickComplaintLink() {
		complaintLink.click();
	}
	public void clickNewComplaintLink() {
		newComplaintLink.click();
	}
	public void clickViewComplaintLink() {
		viewComplaintLink.click();
	}											// Visits Links::::::::::::::::::::::
//	public void clickVisitLink() {
//		String actualTitle  = driver.getTitle();
//		System.out.println("ActualTitle:::"+actualTitle);
//		
//		System.out.println("visitLink :"+visitLink);
//		visitLink.click();
//	}
	
	


	
	
	public void doLogOut() {					// LogOut::::::::::::::::::::::::::
		logOut.click();
		driver.switchTo().alert().accept();
	}
	
	public void waitForPageLoad() {
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[contains(text(),'Complaints')]")));
		wait.until(ExpectedConditions.visibilityOf(complaintLink));
	}
}
