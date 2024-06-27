package model;

import java.util.Scanner;

public class AparelhoTelefonico {

    Scanner sc = new Scanner(System.in);

    public void ligar (String numero){
        System.out.println("Você está ligado para " + numero);
        System.out.println("Quer deixar recado? s/n");
        String respostaCorreioVoz = sc.nextLine();
        if (respostaCorreioVoz.equals("s")) {
            iniciarCorreioVoz();    
        } 
        
        desligar();
    }

    public void atender (){
        System.out.println("Seu telefone está tocando, deseja atender? s/n");
        String respostaToque = sc.next();     
        tocando(respostaToque);
        sc.close();
    }

    private void iniciarCorreioVoz(){
        System.out.println("Deixando correio de voz");
    }

    public void desligar(){
        System.out.println("Desligando ligação");
    }

    private void tocando(String respostaToque){
        if (respostaToque.equals("s")) {
            System.out.println("Atendendo ligação");  
        } 
        desligar();
    }
}
