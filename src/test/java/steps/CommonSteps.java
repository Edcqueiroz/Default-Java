package steps;

import cucumber.api.java.pt.Dado;
import util.TestRule;

public class CommonSteps {

    @Dado("que acesso careers")
    public void acessarCareers(){
        String myCareers = "https://careers.ey.com/ey";
        TestRule.abrirNavegador(myCareers);
    }
}
