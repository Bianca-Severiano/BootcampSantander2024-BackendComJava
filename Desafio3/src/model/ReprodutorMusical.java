package model;

public class ReprodutorMusical {
    
    public void selecionarMusica(String musica){
        System.out.println("Você selecionou a música " + musica);
        tocarMusica();
    }

    public void pausarMusica(){
        System.out.println("Pausando a música");
    }

    private void tocarMusica(){
        System.out.println("Tocando música selecionada");
    }
}
