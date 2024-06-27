package model;

public class NavegadorInternet {
    
    public void exibirPagina(String url) {
        carregandoSolicitacao();
        atualizarPagina();
        System.out.println("Exibindo conteúdo de " + url);
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página web");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void carregandoSolicitacao() {
        System.out.println("Carregando url solicitada");
    }
}
