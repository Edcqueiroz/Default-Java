package pages;

import org.openqa.selenium.support.PageFactory;

public class RegisterMainPage extends RegisterMainPageElementMap {

    public RegisterMainPage(){
        PageFactory.initElements(driver, this);
    }

    public void pesquisarProduto(String produto){
        txtPesquisarProduto.sendKeys(produto);
        btnPesquisarProduto.click();
    }

    public boolean isPesquisaRetornouResultados(){
        return !lblQtdResultadosEncontrados.getText().contains("0");
    }

}
