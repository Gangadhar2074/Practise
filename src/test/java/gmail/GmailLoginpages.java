package gmail;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailLoginpages {
	
	@FindBy(xpath="html/body/nav/div/a[2]")
	WebElement btn_sigin;

	@FindBy(xpath=".//*[@id='view_container']/form/div[2]/div/div[1]/div[1]/div/div[1]")
	WebElement txt_username;

	@FindBy(xpath=".//*[@id='identifierNext']/content")
	WebElement btn_next;

	@FindBy(xpath=".//*[@id='password']/div[1]/div/div[1]/input")
	WebElement txt_pwd;

	@FindBy(xpath=".//*[@id='passwordNext']/content/span")
	WebElement btn_next2;

	@FindBy(xpath="//div[@class='ar6 T-I-J3 J-J5-Ji']")
	WebElement btn_gmailback;


}
