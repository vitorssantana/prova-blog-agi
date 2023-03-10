package pagina;

import base.PaginaBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePagina  extends PaginaBase {

    static final String URL = "https://blogdoagi.com.br/";

    @FindBy (how = How.ID, using = "search-open")
    private WebElement btnLupa;

    @FindBy (how = How.CLASS_NAME, using = "search-field")
    private WebElement campoTermoPesquisa;

    @FindBy (how = How.CLASS_NAME, using = "search-submit")
    private WebElement btnPesquisar;

    //Inicializa driver e acessa URL
    public HomePagina() {
        super(URL);
    }

    /**
     * Clicar na Lupa da Tela
     *
     * @return HomePagina
     */
    public HomePagina clicarLupa(){
        clicarElemento(btnLupa);
        return this;
    }

    /**
     * Preenche o campo de termo para poder pesquisar
     * @param termoPesquisa
     *
     * @return HomePagina
     */
    public HomePagina preencherTermoPesquisa(String termoPesquisa){
        escreverTexto(campoTermoPesquisa, termoPesquisa);
        return this;
    }

    /**
     * Clica no botao de pesquisar
     *
     * @return HomePagina
     */
    public HomePagina clicarPesquisar(){
        clicarElemento(btnPesquisar);
        return this;
    }

    /**
     * Valida se a pesquisa veio sem resultado
     *
     * @return HomePagina
     */
    public HomePagina validarPesquisaSemResultado(){
        validarSeTextoEstaNaPagina("Nenhum resultado");
        validarSeTextoEstaNaPagina("Não encontramos nada para estes termos de busca. Tente novamente com palavras-chave diferentes.");
        return this;
    }

    /**
     * Valida se a pesquisa trouxe resultado
     * @param
     *
     * @return HomePagina
     */
    public HomePagina validarPesquisaComResultado(String termoPesquisa){
        validarSeTextoEstaNaPagina("Resultados da busca por:");
        validarSeTextoEstaNaPagina(termoPesquisa);
        return this;
    }


}
