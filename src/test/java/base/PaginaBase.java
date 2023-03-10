package base;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PaginaBase extends Web{


    protected static WebDriver driver;

    /**
     * Construtor utilizado quando a pagina precisa acessar uma URL
     * @param url
     * @return
     */
    public PaginaBase(String url){
        if(driver == null){
            driver = Web.createChrome(url);
        } else {
            driver.get(url);
        }

        PageFactory.initElements(driver, this);
    }

    /**
     * Construtor utilizado quando a pagina nao precisa acessar uma URL para fazer o teste
     * @return
     */
    public PaginaBase(){

    }

    /**
     * Metodo para escrever texto no elemento
     * @param element - seta o elemento a receber o texto
     * @param texto - o texto a ser escrito no elemento
     *
     * @return
     */
    protected void escreverTexto(WebElement element, String texto){
        element.sendKeys(texto);
    }

    /**
     * Metodo para clicar no elemento da tela
     * @param element - seta o elemento a ser clicado
     *
     * @return
     */
    protected void clicarElemento(WebElement element){
        element.click();
    }

    /**
     * Metodo para validar se o texto esta no PageSource
     * @param texto - Texto a ser verificado no PageSource
     *
     * @return
     */
    protected void validarSeTextoEstaNaPagina(String texto){
        Assert.assertTrue(driver.getPageSource().contains(texto));
    }

    /**
     * Metodo para fechar o browser depois do teste
     *
     * @return
     */
    public void fecharBrowser() {
        driver.close();
        driver = null;
    }
}