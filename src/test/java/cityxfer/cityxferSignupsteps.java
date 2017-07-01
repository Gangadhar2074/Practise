package cityxfer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class cityxferSignupsteps extends CityxferSignuppages {

	WebDriver driver;

	public cityxferSignupsteps(WebDriver driver){
		this.driver=driver;
	}

	@Test
	public boolean signup() {
		btn_signup.click();
		btn_Register.click();
		txt_email.sendKeys("nunna.gangadhar@gmail.com");
		txt_pwd.sendKeys("nunna2074");
		txt_name.sendKeys("nunna");
		txt_mobile.sendKeys("9052567102");
		btn_Submit.click();
		WebElement[] ee={txt_email,txt_pwd,txt_name,txt_mobile};
		boolean validation=validation(ee);
		boolean alert=alert();
		if(validation==true && alert == true){
			return true; 
		}else{
			return false;
		}


	}

	public boolean validation(WebElement[] ee){
		boolean valid_check=true;
		for(int i=0;i<ee.length;i++){ 
			JavascriptExecutor js=(JavascriptExecutor)driver;
			Boolean is_valid =(Boolean)js.executeScript("return argument[0].checkValidity()", ee[i]);
			String message=(String)js.executeScript("return arguments[0].validationmessage", ee[i]);
			if(is_valid==false){
				System.out.println("Error Message"+ message);
				valid_check=false;		 
			}
		}  
		return valid_check;	  
	}

	public boolean alert(){
		boolean alert_valid=false;
		WebDriverWait wait= new WebDriverWait(driver,5);
		try{
			wait.until(ExpectedConditions.alertIsPresent());
			alert_valid=true;

		}catch(TimeoutException eTO){
			alert_valid=false;	  
		}	  
		return  alert_valid;
	}
}
