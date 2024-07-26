

import model.Cliente;
import model.ContaCorrente;
import model.ContaPoupanca;

public class main {
     public static void main (String[] args) {
        Cliente cliente = new Cliente ("Bianca", "00000000089");
        Cliente cliente2 = new Cliente ("Biancaaa", "0089");
       
       
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente);
        contaPoupanca.depositar(100);
        contaPoupanca.sacar(20);
        System.out.println(contaPoupanca.imprimirDados());
        

        ContaCorrente contaCorrente = new ContaCorrente(cliente2);
        contaCorrente.depositar(100);
        contaCorrente.sacar(50);
        System.out.println(contaCorrente.imprimirDados());
        

        contaPoupanca.transferir(10, contaCorrente);
        contaCorrente.transferir(20, contaPoupanca);
        System.out.println(contaPoupanca.imprimirDados());
        System.out.println(contaCorrente.imprimirDados());
        System.out.println("------------------LISTA DE CLIENTE DO BANCO PADRÃO---------------------");
        System.out.println(contaCorrente.getBanco().listarClientes());
        
    }
}
