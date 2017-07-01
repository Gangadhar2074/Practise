package cityxfer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CityxferSignuppages {

	@FindBy(xpath=".//*[@id='userProf']/b/a")
	WebElement btn_signup;

	@FindBy(xpath=".//*[@id='register-btn']")
	WebElement btn_Register;

	@FindBy(xpath="//label[text()='Email:']/../input")
	WebElement txt_email;

	@FindBy(xpath="//input[@id='pwd1']")
	WebElement txt_pwd;

	@FindBy(xpath="//label[text()='Name:']/../input")
	WebElement txt_name;

	@FindBy(xpath="//label[text()='Mobile:']/../input")
	WebElement txt_mobile;

	@FindBy(xpath="//button[text()='Signup']")
	WebElement btn_Submit;

}