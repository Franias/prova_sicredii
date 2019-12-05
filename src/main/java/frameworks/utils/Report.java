package frameworks.utils;

import java.io.File;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Report {

	public static WebDriver driver;	

	private static final String PATH_REPORT = System.getProperty("user.dir") + File.separator + "reports";	
	
	public static ExtentHtmlReporter htmlReport;
	public static ExtentReports extent;
	public static ExtentTest test;

	private static void createReportFolder() {
		File reportDirectory = new File(PATH_REPORT);
		if (!reportDirectory.exists()) {
			reportDirectory.mkdir();
		}
	}
	

	@BeforeClass
	public static void setExtent() {
		createReportFolder();

		htmlReport = new ExtentHtmlReporter(PATH_REPORT + File.separator + "myReport.html");

		htmlReport.config().setDocumentTitle("Automation Report");
		htmlReport.config().setReportName("Execution Test Report");
		
		htmlReport.config().setTheme(Theme.DARK);
		htmlReport.config().setEncoding("UTF-8");

		extent = new ExtentReports();

		extent.attachReporter(htmlReport);

	}

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	}

	@Test
	public void noCommerceLogoTest() {
		
		test = extent.createTest("TestCaseName");
		
		if(driver.getTitle().contentEquals("My Store")) {
			test.log(Status.INFO, "Info test", ScreenshotFw.takeViewpointShot(driver, "primeiro_teste"));
			test.log(Status.PASS, "Imagem: 'demo store', encontrado com sucesso!", ScreenshotFw.capture(driver));
		} else {
			test.log(Status.INFO, "Info test", ScreenshotFw.takeViewpointShot(driver, "primeiro_teste"));
			test.log(Status.FAIL, "Imagem: 'demo store', não encontrado!", ScreenshotFw.capture(driver));
		}
	}
	
	@AfterClass
	public static void endReport() {
		extent.flush();
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}