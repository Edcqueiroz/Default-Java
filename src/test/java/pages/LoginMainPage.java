package pages;

import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class LoginMainPage extends LoginMainPageElementMap {

    public LoginMainPage(){
        PageFactory.initElements(driver, this);
    }

    public void clicarBtnSignIn(){
        linkSignIn.click();
    }
    public void preencherDadosDeLoginValidos(){
        waitVisibilityOf(userName);
        userName.sendKeys("edcqueiroz@outlook.com");
        password.sendKeys("Cidu@1036");
    }
    public void preencherDadosDeLoginInvalidos(){
        waitVisibilityOf(userName);
        userName.sendKeys("edcqueiroz@gmail.com");
        password.sendKeys("Cidu");
    }

    public void clicarNoBotaoSignIn() {
        waitVisibilityOf(btnSignIn);
        btnSignIn.click();
    }

    public void validoLogin() {
        waitVisibilityOf(candidateProfile);
        candidateProfile.isDisplayed();
    }

    public void validoMsgDeErro() {
        String textoElement = errorMsg.getText();
        assertEquals("Invalid username or password. Please re-enter your login info.", textoElement);
    }
}
