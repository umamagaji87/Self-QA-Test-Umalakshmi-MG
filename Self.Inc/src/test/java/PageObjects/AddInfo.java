package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import StepDefination.BaseClass;

public class AddInfo  extends BaseClass{

	public AddInfo() {
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy(name = "address1")
	WebElement txt_address1;
	
	@FindBy(name = "address2")
	WebElement txt_address2;
	
	@FindBy(name = "city")
	WebElement txt_city;
	
	@FindBy(name = "state")
	WebElement txt_state;
	
	@FindBy(name = "zipCode")
	WebElement zip;
	
	@FindBy(name = "phone")
	WebElement txt_contact;
	
	@FindBy(name = "email")
	WebElement txt_mail;
	
	@FindBy(name = "dobMonth")
	WebElement mm;
	
	@FindBy( name ="dobDay")
	WebElement dd;
	
	@FindBy( name = "dobYear")
	WebElement yy;
	
	@FindBy(xpath= "//button[@type='submit']")
	WebElement btsubmit;
	
	
	//Action Methods
	
	public void setAddress1(String address1) {
		
		System.out.println("in setAddress1 "+ address1);
		txt_address1.sendKeys(address1);
	}
	
	public void setAddress2(String address2) {
		System.out.println("in setAddress2 "+ address2);
		txt_address2.sendKeys(address2);
	}
	public void setLoc(String city, String state, String zipcode) {
		System.out.println("in setLoc "+ city+state+zipcode);
		txt_city.clear();
		txt_city.sendKeys(city);
		
		txt_state.click();
		Select drop= new Select(txt_state);
		drop.selectByValue(state);
	
		zip.clear();
		zip.sendKeys(zipcode);
	}
	
	
	public void phon(String phone, String email) {
		System.out.println("in phon "+ phone+email);
		txt_contact.clear();
		txt_contact.sendKeys(phone);
		
		txt_mail.clear();
		txt_mail.sendKeys(email);
		
	}
	
	
	public void dateMonth(String month, String date, String year) {
		mm.clear();
		mm.sendKeys(month);
		
		dd.clear();
		dd.sendKeys(date);
		
		yy.clear();
		yy.sendKeys(year);
	}
	
	
	
	public void clickButton() {
		btsubmit.click();
	}
}
