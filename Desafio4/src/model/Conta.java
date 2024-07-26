package model;


public abstract class Conta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected Banco banco;

    private static final int AGENCIA_PADRAO = 00001;
    private static final Banco BANCO_PADRAO = new Banco("Bradesco");
    private static int SEQUENCIAL = 0;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.banco = BANCO_PADRAO;
        banco.incluirCliente(cliente);
    }

    public Conta(Cliente cliente, Banco banco){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.banco = banco;
        banco.incluirCliente(cliente);
    }


    public String sacar(double valor) {
        saldo -= valor;
        return "Saque realizado com sucesso, NOVO SALDO: R$ " + getSaldo();
    };

    public String depositar(double valor) {
        saldo += valor;
        return "Depósito realizado com sucesso, NOVO SALDO: R$ " + getSaldo();
    };

    public String transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
        return "Transferência realizada com sucesso para " + contaDestino.cliente.getNome();
    };
    
    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    public Banco getBanco() {
        return banco;
    }

    protected String imprimirDados() {
        return "CLIENTE: " + getCliente().getNome() + " CPF: " + getCliente().getCPF() + " \n"
        + " Saldo: R$" + getSaldo() + " Conta: " + getNumero() + " Agência: " + getAgencia() + " Banco: " + getBanco().getNome();
    }

}
