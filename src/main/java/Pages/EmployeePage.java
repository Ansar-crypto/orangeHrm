package Pages;

import Common.BaseClass;
import Common.CommonUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePage extends BaseClass {
    WebDriver driver;
    CommonUtil commonUtil;
    @FindBy(xpath = "//span[text()='PIM']")
    WebElement pim;
    @FindBy(xpath = "//button[text()=' Add ']")
    WebElement add;
    @FindBy(xpath = "//input[@name='firstName']")
    WebElement firstName;
    @FindBy(xpath = "//input[@name='middleName']")
    WebElement middleName;
    @FindBy(xpath = "//input[@name='lastName']")
    WebElement lastName;
    @FindBy(xpath = "//button[text()=' Save ']")
    WebElement save;

       public EmployeePage(WebDriver driver){
           this.driver=driver;
           PageFactory.initElements(this.driver,this);
           commonUtil=new CommonUtil(driver);
       }
       public void createEmp() throws InterruptedException {
           commonUtil.waitForElementToVisible(pim);
           pim.click();
           commonUtil.waitForElementToVisible(add);
           add.click();
           commonUtil.waitForElementToVisible(firstName);
           firstName.sendKeys("Ansar");
           commonUtil.waitForElementToVisible(middleName);
           middleName.sendKeys("J");
           commonUtil.waitForElementToVisible(lastName);
           lastName.sendKeys("Shaikh");
           Thread.sleep(5000);
           save.click();
       }
}
