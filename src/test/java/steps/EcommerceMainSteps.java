package steps;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;
import pages.RegisterMainPage;

public class EcommerceMainSteps {

    @E("pesquiso o produto \"(.*)\"")
    public void pesquisarProduto(String produto){
        RegisterMainPage registerMainPage = new RegisterMainPage();
        registerMainPage.pesquisarProduto(produto);
    }

    @Entao("a pesquisa deve retornar resultados")
    public void validarQuePesquisaRetornouResultados(){
        RegisterMainPage registerMainPage = new RegisterMainPage();
        Assert.assertTrue("O resultado da pesquisa está vazio.", registerMainPage.isPesquisaRetornouResultados());
    }
}
