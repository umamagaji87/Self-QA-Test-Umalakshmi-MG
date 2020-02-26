package StepDefination;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.AddInfo;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

	public class AddInfoStep extends BaseClass {
		
		@Before
		public void setup() throws IOException
		{
			configProp=new Properties();
			FileInputStream configPropfile=new FileInputStream("/Users/admin/eclipse-workspace/Self.Inc/Config/config.properties");
			configProp.load(configPropfile);
			
			logger=Logger.getLogger("Self.Inc"); //Added logger
			PropertyConfigurator.configure("/Users/admin/eclipse-workspace/Self.Inc/Config/log4j.properties");
			
			
			String br=configProp.getProperty("browser");
			
			if(br.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", configProp.getProperty("chromepath"));
				driver = new ChromeDriver();	
			}
			else if (br.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", configProp.getProperty("firefoxpath"));
				driver = new FirefoxDriver();	
			}
			
			logger.info("***********Launching Browser********************");
			
			
		}
		
		@Given("^User Launch Chrome Browser$")
		public void user_Launch_Chrome_Browser() {
			
			logger.info("***********Browser Launched********************");
		}

		@When("^User opens URL \"([^\"]*)\"$")
		public void user_opens_URL(String url) {
			logger.info("***********Opening URL********************");
			driver.get(url);
			if(ad == null) {
				ad=new AddInfo();
			}
		}

		@And("^User maximaze the window$")
		public void user_maximaze_the_window() {
			logger.info("***********Maximize Window********************");
			driver.manage().window().maximize();
			
		}

		@And("^User enters Address \"([^\"]*)\" and \"([^\"]*)\"$")
		public void user_enters_Address_and(String txt_address1, String txt_address2) {
			
			logger.info("***********Enter Address********************");
			ad.setAddress1(txt_address1);
			ad.setAddress2(txt_address2);
			
		}

		@And("^User enters location \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
		public void user_enters_location_and(String txt_city, String txt_state, String zip) {
			logger.info("***********Enter Location Details********************");
			ad.setLoc(txt_city, txt_state, zip);
			
		}

		@And("^User enters contact details \"([^\"]*)\" and \"([^\"]*)\"$")
		public void user_enters_contact_details_and(String txt_contact, String txt_mail) {
			logger.info("***********Enter Contact Info********************");
			ad.phon(txt_contact, txt_mail);
		}

		@And("^User enters DOB \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
		public void user_enters_DOB_and(String mm, String dd, String yy) {
			logger.info("***********Enter DOB********************");
			ad.dateMonth(mm, dd, yy);
			
		}

		@When("^User click submit button$")
		public void user_click_submit_button() {
			logger.info("***********Click Submit Button********************");
			ad.clickButton();
		
			
		}
	


	}


