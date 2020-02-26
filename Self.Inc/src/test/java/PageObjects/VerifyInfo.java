package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefination.BaseClass;

public class VerifyInfo extends BaseClass {

	
	public VerifyInfo() {
		PageFactory.initElements(driver, this); 
	}

	@FindBy(xpath="//div[@id=\"root\"]")
	WebElement txt_header;
	
	@FindBy(xpath="//button[@class=\"sc-fzXfLP hyIuMF sc-fzXfLQ sc-fzXfMz ljSzHc\"]")
	WebElement bt_continue;
	
	public void readinfo() {
		String allvalues= txt_header.getText();
		System.out.println("***Print Personal Information is:   "  + allvalues);
	}

	public void continueinfo() {
		bt_continue.click();
	}

}


	




