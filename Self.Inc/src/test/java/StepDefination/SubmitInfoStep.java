package StepDefination;

import PageObjects.SubmitInfo;
import org.junit.Assert;
import org.openqa.selenium.By;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;



public class SubmitInfoStep extends BaseClass{

	public SubmitInfo submitInfo;
	@Then("^User view message status \"([^\"]*)\"$")
	public void user_view_message_status(String txtMsg) {
		logger.info("**********View Success! Msg********************");
		try{
			Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
				.contains(txtMsg));
		System.out.println("Assert Passed!!");
	
		}
		catch(Exception e) {
			System.out.println("Assert Failed");
		}
	}
	

	@And("^User close window$")
	public void user_close_window() {
		logger.info("***********Close Driver********************");
		driver.close();

	}
}
