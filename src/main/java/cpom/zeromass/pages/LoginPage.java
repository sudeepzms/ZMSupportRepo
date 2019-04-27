package cpom.zeromass.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	//@FindBy(id = "username")
	@FindBy(xpath = "//input[@id='username']")
	private WebElement userNameWE;
	
	@FindBy(name = "password")
	private WebElement passwdWE;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitWE;
	
	//public static final String url = "http://testsupport.zero-mass.org/ZMSupport/login#!";
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String uname) {
		userNameWE.sendKeys(uname);
	}
	
	public void enterPassword(String password1) {
		passwdWE.sendKeys(password1);
	}
	
	public void enterLogin() {
		submitWE.click();
	}
	
	public void navigateToApp(String url) {
		this.driver.get(url);
	}
	
	public void doLogin(String userName, String passwd, String url) {
		this.navigateToApp(url);
		System.out.println("LoginPage User name:::::::"+userName);
		this.enterUserName(userName);
		System.out.println("LoginPage Password::::::::"+passwd);
		this.enterPassword(passwd);
		this.enterLogin();
	}

}
