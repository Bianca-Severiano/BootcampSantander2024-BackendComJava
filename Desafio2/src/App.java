import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int valorMenor;
        int valorLimite;
        try {
            System.out.println("Digite o primeiro valor:");
             valorMenor = scan.nextInt();
            System.out.println("Digite o valor limite:");
            valorLimite = scan.nextInt();
            contar(valorMenor, valorLimite);
        } catch (InputMismatchException e) {
            System.err.println("Valores precisam ser inteiros");
        } catch (ParametrosInvalidosException e){
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void contar (int valorMenor, int valorLimite) throws ParametrosInvalidosException {
        int contagem;
        if (valorMenor < valorLimite) {
            contagem = valorLimite - valorMenor;
        } else {
            throw new ParametrosInvalidosException();
        }   

        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo número " + (i+1));
        }

    }
}
