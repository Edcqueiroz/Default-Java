package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.CommonPage;
import pages.LoginMainPage;

public class LoginMainSteps {
    LoginMainPage login = new LoginMainPage();
    @Quando("clico no link \"SignIn\"")
    public void clicoSignIn(){
        login.clicarBtnSignIn();
    }
    @E("^preencho email e senha válidos$")
    public void preenchoEmailESenhaVálidos() {
        login.preencherDadosDeLoginValidos();
    }
    @E("^clico no botão SignIn$")
    public void clicoNoBotãoSignIn() {
        login.clicarNoBotaoSignIn();

    }

    @Então("^valido login com sucesso$")
    public void validoLoginComSucesso() {
        login.validoLogin();

    }

    @E("^preencho email e senha inválidos$")
    public void preenchoEmailESenhaInválidos() {
        login.preencherDadosDeLoginInvalidos();
    }

    @Então("^valido mensagem de erro$")
    public void validoMensagemDeErro() {
        login.validoMsgDeErro();

    }
}
