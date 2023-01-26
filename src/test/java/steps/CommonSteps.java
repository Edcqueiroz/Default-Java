package steps;

import cucumber.api.java.pt.Dado;
import util.TestRule;

public class CommonSteps {

    @Dado("que acesso o login do automationtesting")
    public void acessarAutomationTesting(){
        String Register = "https://demo.automationtesting.in/SignIn.html";
        TestRule.abrirNavegador(Register);
    }

    @Dado("que acesso o register")
    public void acessarregiter(){
        String Register = "https://demo.automationtesting.in/Register.html";
        TestRule.abrirNavegador(Register);
    }
}
