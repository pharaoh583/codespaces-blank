package bo.edu.ucb;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import bo.edu.ucb.driver.DriverFactory;
import bo.edu.ucb.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import bo.edu.ucb.report.ReportListener;

@Listeners({ExtentITestListenerClassAdapter.class, ReportListener.class})
public abstract class BaseTest {

    String driverPath = "C:\\chrome-win64\\chrome.exe";

    protected static WebDriver driver;
    protected LoginPage loginPage;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeTest
    public void preCondition() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://cses.fi/login");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void postCondition(){
        driver.quit();
    }
}