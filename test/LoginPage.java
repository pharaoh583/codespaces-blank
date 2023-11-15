package bo.edu.ucb;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {

    private WebDriver driver;


    public LoginPage(WebDriver webDriver){
        this.driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='nick']")
    private WebElement userNameField;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/form/fieldset/p[2]/input")
    private WebElement passwordField;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/form/p/input") 
    private WebElement submitButton;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/h1")
    private WebElement titleAfterLogin;

    public String getTextTitleLoginPage(){
        return titleAfterLogin.getText();
    }

    public LoginPage loginToPlatform(String user, String pass){
        userNameField.sendKeys(user);
        passwordField.sendKeys(pass);
        submitButton.click();
        return this;
    }



}