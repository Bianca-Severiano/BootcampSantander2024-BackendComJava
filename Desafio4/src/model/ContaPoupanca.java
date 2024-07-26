package model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public String imprimirDados() {
        return "===== Extrato Conta Poupança ===== \n" + super.imprimirDados();
    }
    
}
