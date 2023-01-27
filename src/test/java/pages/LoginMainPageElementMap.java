package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMainPageElementMap extends CommonPage {

    @FindBy(xpath = "//div[@class='links']//a[text()='Sign in']")
    protected WebElement linkSignIn;

    @FindBy(name = "username")
    protected WebElement userName;

    @FindBy(name = "password")
    protected WebElement password;

    @FindBy(xpath = "//button[@onclick='return validateFields();']")
    protected WebElement btnSignIn;

    @FindBy(xpath = "//h1[text()='Candidate Profile']")
    protected WebElement candidateProfile;

    @FindBy(id = "errorMsg_1")
    protected WebElement errorMsg;

}
