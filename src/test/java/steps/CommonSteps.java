package steps;

import cucumber.api.java.pt.Dado;
import util.TestRule;

public class CommonSteps {

    @Dado("que acesso o automationtesting")
    public void acessarAutomationTesting(){
        String ecommerceUrl = "https://demo.automationtesting.in/Register.html";
        TestRule.abrirNavegador(ecommerceUrl);
    }

}
