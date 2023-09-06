package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
		
	public static WebDriver driver;
	public static Properties prop=new Properties();
	public static FileReader fr;
	public static Properties loc=new Properties();
	public static FileReader fr1;
	public static Logger log=LogManager.getLogger(BaseTest.class);
	
	@BeforeMethod
	public void setUp() throws IOException {
		if(driver==null) {
//			System.out.println("The path is "+System.getProperty("user.dir"));//we use this to remove the hardcode of the path and this will print the path till project location.
			FileReader fr=new FileReader(System.getProperty("user.dir")+"/src/test/resources/configfiles/config.properties");
			prop.load(fr);
			FileReader fr1=new FileReader(System.getProperty("user.dir")+"/src/test/resources/configfiles/locators.properties");
			loc.load(fr1);
		}
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			log.info("setup successful!");
			driver=new ChromeDriver();
			log.info("browser has opened!");
			driver.manage().window().maximize();
			log.info("window has been maximised!");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			log.info("Implicit wait.....");
			driver.get(prop.getProperty("stagingurl"));
			log.info("URL has entered!");
			driver.findElement(By.id(loc.getProperty("username_loc"))).clear();
			driver.findElement(By.id(loc.getProperty("username_loc"))).sendKeys(prop.getProperty("username"));
			driver.findElement(By.id(loc.getProperty("password_loc"))).clear();
			driver.findElement(By.id(loc.getProperty("password_loc"))).sendKeys(prop.getProperty("password"));
			driver.findElement(By.xpath(loc.getProperty("login_loc"))).click();
			log.info("Login Successful!");
			
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(prop.getProperty("stagingurl"));
		}
		//here you can define more browsers like edge....
		
	}
//	@AfterMethod
//	
//	public void tearDown() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.close();
//		System.out.println("Teardown Successful.");
//	}

}
