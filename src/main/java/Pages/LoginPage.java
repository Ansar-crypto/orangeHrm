package Pages;

import Common.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
public LoginPage(WebDriver driver){
    this.driver=driver;
    }
    public void login(String username,String password) throws InterruptedException {
       // CommonUtil commonUtil=new CommonUtil(driver);
       // commonUtil.waitForAllElementToVisible(By.xpath("//input[@placeholder='Username']"));
        Thread.sleep(5000);
    driver.findElement(By.xpath("//label[text()='Username']/following::input[1]")).sendKeys(username);
    driver.findElement(By.xpath("//label[text()='Password']/following::input")).sendKeys(password);
    driver.findElement(By.xpath("//button[text()=' Login ']")).click();
    }

    public static class EmployeeTest extends BaseClass {
        WebDriver driver;

        @FindBy(xpath = "//span[text()='Admin']")
        WebElement admin;
        @FindBy(xpath = "//button[text()=' Add ']")
        WebElement addNew;
        @FindBy(xpath = "//div[text()='-- Select --'][1]")
        WebElement userRole;
        @FindBy(xpath = "//div[text()='ESS']")
        WebElement role;

        public EmployeeTest(WebDriver driver){
        this.driver=driver;
            PageFactory.initElements(this.driver,this);
        }
        public void createEmp(){
            admin.click();
            addNew.click();
            userRole.click();
            role.click();
        }
    }
}
