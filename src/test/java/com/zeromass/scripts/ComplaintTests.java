 package com.zeromass.scripts;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.zeromass.drivers.MyDriverUtil;
import cpom.zeromass.pages.ComplaintPage;
import cpom.zeromass.pages.LandingPage;
import cpom.zeromass.pages.LoginPage;
import cpom.zeromass.pages.CheckValidationBySubmitBtn;

public class ComplaintTests {

	private LandingPage landingPage;
	private LoginPage loginPage;
	private ComplaintPage complaintPage; 
	//private CheckValidationBySubmitBtn checkVldtnBySbtBtn;
	
	public ComplaintTests() {
		this.loginPage = new LoginPage(MyDriverUtil.getDriver());
		this.landingPage = new LandingPage(MyDriverUtil.getDriver());
		this.complaintPage = new ComplaintPage(MyDriverUtil.getDriver());	
		//this.checkVldtnBySbtBtn = new CheckValidationBySubmitBtn(MyDriverUtil.getDriver());
		
	}	
	
	@BeforeClass  
	public void doBefore() {
		System.out.println("its doBefore Method::::::::::::::::::::::::::::");
		System.out.println("In doBefore method::::::::::"+TestConfigs.properties.getProperty("username"));
		System.out.println("In doBefore method::::::::::"+TestConfigs.properties.getProperty("passsword"));
		this.loginPage.doLogin(TestConfigs.properties.getProperty("username"), TestConfigs.properties.getProperty("passsword"), TestConfigs.properties.getProperty("url"));
		this.landingPage.waitForPageLoad();
		
		System.out.println("In doBefore method::::::::::"+TestConfigs.properties.getProperty("username"));
				}
	
	/*@Test(enabled = false)
	public void testComplaint() {
		landingPage.clickComplaintLink();
		Reporter.log("Complaint Tests run successfully with so so data");
		this.landingPage.waitForPageLoad();
		
		System.out.println("hello Click on complaint link");		
	}*/
	
	@Test(priority = 0)
	public void NewCmplaint() throws InterruptedException {
		//this.landingPage.waitForPageLoad();
		//landingPage.clickNewComplaintLink();
		System.out.println("CSPID IS:::::::::"+TestConfigs.properties.getProperty("cspid"));	
		
//		this.complaintPage.doComplaint(TestConfigs.properties.getProperty("incCspid"), TestConfigs.properties.getProperty("invCspid2"), TestConfigs.properties.getProperty("corrCspid3"), TestConfigs.properties.getProperty("category"), TestConfigs.properties.getProperty("subcategory"), TestConfigs.properties.getProperty("complaintDescription"));
		this.complaintPage.doComplaint(TestConfigs.properties.getProperty("corrCspid3"), TestConfigs.properties.getProperty("category"), TestConfigs.properties.getProperty("subcategory"), TestConfigs.properties.getProperty("complaintDescription"));
		System.out.println("Should be print Description text as:::"+TestConfigs.properties.getProperty("complaintDescription"));
	}
	
	public void ValidMsg()
	{
		
	}
	public void testt(){
	String actualmessage = complaintPage.ValidMsg();
	}
	
//	@Test
//	public void ViewComplaint() {
//		landingPage.clickViewComplaintLink();
//			}
	//complaintPage.actual;
	//complaintPage a = new complaintPage(String);
	
	
		
	@Test(enabled = false) 
	public void test() {
		Reporter.log("Test scenario passed with complaint details");
	}
	
//	@AfterMethod
//	public void afterMethod() {
//		landingPage.doLogOut();
//	}

}
