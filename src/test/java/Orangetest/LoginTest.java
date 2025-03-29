package Orangetest;

import Common.BaseClass;
import Common.PropertyHandling;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends BaseClass {
    WebDriver driver;
@BeforeClass
    public void setup() throws IOException, InterruptedException {
    PropertyHandling propertyHandling=new PropertyHandling();
    String browser=propertyHandling.getProperty("browser");
    launchBrowser(browser);
    driver=super.driver;
    String orangehrmUrl=propertyHandling.getProperty("orangehrmUrl");
    driver.get(orangehrmUrl);
    String username=propertyHandling.getProperty("username");
    String password=propertyHandling.getProperty("password");
    LoginPage loginPage=new LoginPage(driver);
    loginPage.login(username,password);
    }
    @Test
    public void login(){

    }
}
