import java.util.Scanner;

import model.ContaTerminal;

public class main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor digite o nome da agência!");
        String agencia = scan.next();

        System.out.println("Por favor digite o seu nome!");
        String nomeCliente = scan.next();

        System.out.println("Por favor digite o número da agência!");
        int numero = scan.nextInt();

        System.out.println("Por favor digite o seu saldo!");
        Float saldo = scan.nextFloat();

        ContaTerminal contaTerminal = new ContaTerminal (numero, agencia, nomeCliente, saldo);
        
        System.out.println(contaTerminal.toString());

    }
}
