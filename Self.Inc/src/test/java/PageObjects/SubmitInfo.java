package PageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefination.BaseClass;

public class SubmitInfo extends BaseClass{

	public SubmitInfo() {
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy(className = "sc-AykKD fHgPER")
	 WebElement txt_msg;
	
	@FindBy(className ="sc-fzXfLP hyIuMF sc-fzXfLQ sc-fzXfMB gUeuOQ")
	 WebElement bt_startover;
	

//	public void msgSucess() {
//		txt_msg.getTagName();
//	}
//	
}
