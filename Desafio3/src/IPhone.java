import model.AparelhoTelefonico;
import model.NavegadorInternet;
import model.ReprodutorMusical;

public class IPhone {
    public static void main(String[] args) throws Exception {
       
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        NavegadorInternet navegadorInternet = new NavegadorInternet();
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();

        aparelhoTelefonico.ligar("11999999999");
        aparelhoTelefonico.atender();

        navegadorInternet.adicionarNovaAba();
        navegadorInternet.exibirPagina("www.google.com");
        navegadorInternet.atualizarPagina();

        reprodutorMusical.selecionarMusica("Elephant - Tame Impala");
        reprodutorMusical.pausarMusica();
    }
}
