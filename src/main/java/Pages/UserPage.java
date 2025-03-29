package Pages;

import Common.BaseClass;
import Common.CommonUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class UserPage extends BaseClass {
    WebDriver driver;
    CommonUtil commonUtil;
    @FindBy(xpath = "//span[text()='Admin']")
    WebElement admin;
    @FindBy(xpath = "//button[text()=' Add ']")
    WebElement addNew;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
    WebElement userRole;
    @FindBy(xpath = "(//div[text()='-- Select --'])[2]")
    WebElement status;
    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[2]")
    WebElement enabled;
    @FindBy(xpath = "(//input[@type='password'])[1]")
    WebElement password;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
    WebElement userName;
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement empName;
    @FindBy(xpath = "(//input[@type='password'])[2]")
    WebElement confirmPassword;
    @FindBy(xpath = "//button[text()=' Save ']")
    WebElement save;

    public UserPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(this.driver,this);
        commonUtil=new CommonUtil(driver);
    }
    public void userTest() throws AWTException, InterruptedException {
        commonUtil.waitForElementClickable(admin);
        admin.click();
        commonUtil.waitForElementClickable(addNew);
        addNew.click();
        commonUtil.waitForElementClickable(userRole);
        userRole.click();
        commonUtil.waitForElementClickable(status);
        status.click();
        commonUtil.waitForElementClickable(enabled);
        enabled.click();
        password.sendKeys("Admin@123");
        commonUtil.waitForElementClickable(empName);
        empName.sendKeys("Ansar J Shaikh");
        Actions actions= new Actions(driver);
        actions.keyDown(Keys.ENTER).build().perform();
        //Thread.sleep(5000);
        commonUtil.waitForElementClickable(userName);
        userName.sendKeys("Ansar");
        commonUtil.waitForElementClickable(confirmPassword);
        confirmPassword.sendKeys("Admin@123");
        save.click();
    }
}
