package cpom.zeromass.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.zeromass.drivers.MyDriverUtil;

public class CheckValidationBySubmitBtn {

 	private static WebDriver driver;
//	static WebDriver driver = MyDriverUtil.getDriver();
	
	public static void checkValidation(WebElement SubmitBtn) throws InterruptedException  {
		System.out.println("Driver :"+driver);
		System.out.println("its from CheckValidationBySubmitBtn"+SubmitBtn);
		SubmitBtn.click();
		Thread.sleep(1000);
		System.out.println("After Click on Check Validation..."+SubmitBtn);
		Alert alert = driver.switchTo().alert(); //Switching on Alert Popup
       	String alertMsg = alert.getText(); 		//Capturing Alert Message
       	System.out.println(alertMsg);
       	alert.accept();
	}
	
//       	public CheckValidationBySubmitBtn(WebDriver driver) {
//       		this.driver = driver;
//       		PageFactory.initElements(driver, this);
//	}
}
