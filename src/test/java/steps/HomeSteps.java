package steps;

import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import func.HomeFunc;

public class HomeSteps {

    HomeFunc home;

    @Dado("que estou na homepage do Blog do Agi")
    public void que_estou_ha_homepag_do_Blog_do_Agi() {
        home = new HomeFunc();
    }

    @Quando("eu realizo a pesquisa com o termo {string}")
    public void eu_realizo_a_pesquisa_com_o_termo(String string) {
        home.pesquisarTermo(string);
    }

    @Entao("devo ver uma tela com mensagem de nenhum resultado encontrado")
    public void devo_ver_uma_tela_com_mensagem_de_nenhum_resultado_encontrado() {
        home.validarPesquisaSemResultado();
    }

    @Entao("devo ver todas as postagens que utilizaram o termo {string}")
    public void devo_ver_todas_as_postagens_que_utilizaram_o_termo(String string) {
        home.validarPesquisaComResultado(string);
    }

    @After
    public void tearDown(){
        home.fecharBrowser();
    }

}
