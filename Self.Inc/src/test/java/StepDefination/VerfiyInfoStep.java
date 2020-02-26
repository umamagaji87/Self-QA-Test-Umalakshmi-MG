package StepDefination;


import org.junit.Assert;
import org.openqa.selenium.By;

import PageObjects.VerifyInfo;
import StepDefination.BaseClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;



	public class VerfiyInfoStep extends BaseClass{
	
		@And("^User views personal information$")
		public void user_views_personal_information() {
			logger.info("***********Views Personal Info********************");
				ver = new VerifyInfo();
				ver.readinfo();
	

		}
		@Then("^User can view confirmation message \"([^\"]*)\"$")
		public void user_can_view_confirmation_message(String msg) {
	
			logger.info("************Validates Confirmation Msg*******************");
			try {
				Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
					.contains(msg));
			System.out.println("Confirmation Message is:   " + msg);
			System.out.println("Assert Passed!!");
			}
		catch(Exception e)
			{
				System.out.println("Assert Failed");
			}
		}

		@And("^User click on continue button$")
		public void user_click_on_continue_button() {
			logger.info("***********Click Button********************");
			ver.continueinfo();
			
			
		}


}
