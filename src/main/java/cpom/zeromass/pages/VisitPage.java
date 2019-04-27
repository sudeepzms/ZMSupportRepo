package cpom.zeromass.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cpom.zeromass.pages.ComplaintPage;


public class VisitPage {
	
private WebDriver driver;
@FindBy(xpath = "//span[contains(text(),'Visits')]")
private WebElement visitLinkWE;

@FindBy(xpath = "//a[contains(text(),'Enter Visit Details')]")//::::::::::::::::ENTER VISIT:::::::::::::
private WebElement enterVisitDetailsLinkWE;

@FindBy(xpath = "//input[@id='datepicker']")
private WebElement visitDatePickerWE;

@FindBy(xpath = "//td[contains(text(),'17')]")
private WebElement date;

@FindBy(xpath = "//select[@id='subject']")
private WebElement selectSubWE;

@FindBy(xpath = "//input[@id='branchCodeInput']")
private WebElement branchCodeWE;

@FindBy(xpath = "//textarea[@id='description1']s")
private WebElement visitDescriptionWE;						//::::::::::::::::::::::::::::::::::::::

@FindBy(xpath = "//button[@id='submit']")
private WebElement enterVisitSubmitBtnWE;

@FindBy(xpath = "//a[contains(text(),'Search By Employee')]")
private WebElement searchByEmployeeWE;

@FindBy(xpath = "//a[contains(text(),'Search By CSP Id')]")
private WebElement searchByCspIdWE;

@FindBy(xpath = "//a[contains(text(),'Enter Visit Details')]")
private WebElement entrVstDtlsWE;

@FindBy(xpath = "//a[contains(text(),'View Visit Details')]")
private WebElement viewVisitDetailsLinkWE;


//===================================================================================PageFactory
public VisitPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
//===================================================================================

public void clickVisitLink() {
	String actualTitle  = driver.getTitle();
	System.out.println("ActualTitle:::"+actualTitle);
	
	System.out.println("visitLink :"+visitLinkWE);
	visitLinkWE.click();
}

public void clickEnterVisitDetailsLink() {
	enterVisitDetailsLinkWE.click();
}

public void selectDate() throws InterruptedException {
	visitDatePickerWE.click();
	Thread.sleep(500);
	date.click();
}

public void selectSubject(String abc) {
	Select sub = new Select(selectSubWE);
	sub.selectByVisibleText(abc);	
}
public void EnterVstBrCode(String visitBrCode) {
	branchCodeWE.sendKeys(visitBrCode);
}
public void VisitDscrptn(String vstDscr) {
	visitDescriptionWE.sendKeys(vstDscr);
}

public void clickOnVisitSubmitBtn() {
	enterVisitSubmitBtnWE.click();
	Alert alert = driver.switchTo().alert(); //Switching on Alert Popup
   	String alertMsg = alert.getText(); 		//Capturing Alert Message
   	System.out.println(alertMsg);
   	alert.accept();
}
public void clickViewVisitDetailsLink() {
	viewVisitDetailsLinkWE.click();
}

public void clickSearchByEmployee() {
	searchByEmployeeWE.click();
}

public void clickSearchByCspId() {
	searchByCspIdWE.click();
}

public void doVisit(String vstSub, String visitBrCode, String visitDsc) throws InterruptedException
{
	clickVisitLink();
	Thread.sleep(1000);
	clickEnterVisitDetailsLink();
	selectDate();
	selectSubject(vstSub);
	EnterVstBrCode(visitBrCode);
	VisitDscrptn(visitDsc);
	clickOnVisitSubmitBtn();
}
}