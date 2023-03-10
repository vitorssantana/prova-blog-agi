package func;

import pagina.HomePagina;

public class HomeFunc {

    HomePagina pagina = new HomePagina();

    /**
     * Metodo para fazer a acao de pesquisar o termo
     * @param  termoPesquisa - o termo a ser pesquisado
     *
     * @return
     */
    public void pesquisarTermo(String termoPesquisa){
        pagina
                .clicarLupa()
                .preencherTermoPesquisa(termoPesquisa)
                .clicarPesquisar();
    }

    /**
     * Valida se a pesquisa veio sem resultado
     *
     * @return
     */
    public void validarPesquisaSemResultado(){
        pagina
                .validarPesquisaSemResultado();
    }

    /**
     * Valida se a pesquisa trouxe resultado
     * @param termoPesquisa
     *
     * @return
     */
    public void validarPesquisaComResultado(String termoPesquisa){
        pagina
                .validarPesquisaComResultado(termoPesquisa);
    }

    /**
     * Fecha o broswer apos o teste
     *
     * @return
     */
    public void fecharBrowser(){
        pagina
                .fecharBrowser();
    }



}
