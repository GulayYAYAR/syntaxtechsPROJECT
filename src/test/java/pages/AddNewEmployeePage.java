package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddNewEmployeePage extends CommonMethods {
    @FindBy(id="middleName")
    public WebElement firstName;
    @FindBy(id="lastName")
    public WebElement lastName;
    @FindBy(id="middleName")
    public WebElement middleName;

    @FindBy(id="employeeId")
    public WebElement empIdLoc;

    @FindBy(id="chkLogin")
    public WebElement checkbox;

    @FindBy(id="photofile")
    public WebElement photograph;

    @FindBy(id="user_name")
    public WebElement createUsername;

    @FindBy(id="user_password")
    public WebElement createPassword;

    @FindBy(id="re_password")
    public WebElement rePassword;

    @FindBy(id="btnSave")
    public WebElement saveButton;
    public AddNewEmployeePage(){
        PageFactory.initElements(driver,this);
    }
}
