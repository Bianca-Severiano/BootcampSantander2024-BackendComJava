package model;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public String imprimirDados() {
        return "===== Extrato Conta Corrente ===== \n" + super.imprimirDados();
    }

}
