package StepDefination;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import PageObjects.AddInfo;
import PageObjects.VerifyInfo;

public class BaseClass {

	public static WebDriver driver;
	public AddInfo ad;
	public static Logger logger;
	public Properties configProp;
	public VerifyInfo ver;
	
}
