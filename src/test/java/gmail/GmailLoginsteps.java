package gmail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GmailLoginsteps extends GmailLoginpages {
	WebDriver driver;
	
	public GmailLoginsteps(WebDriver driver){
		this.driver= driver;
	}
	@Test
	public void login(){
		btn_sigin.click();
		txt_username.sendKeys("nunna.gagadhar@gmail.com");
		btn_next.click();
		txt_pwd.sendKeys("905256710211");
		btn_next2.click();
		mailvalidation();
	}
	@Test
	public void mailvalidation(){
		List<WebElement> a = driver.findElements(By.xpath("//*[@class='yW']/span"));
		for(int i=0;i<a.size();i++){
			if(a.get(i).getText().equalsIgnoreCase("jabong")){
				a.get(i).click();
				
			}
		}
	}
	

}
