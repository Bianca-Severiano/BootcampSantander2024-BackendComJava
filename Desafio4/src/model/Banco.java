package model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    
    private String nome;
    private List<Cliente> listaClientes;

    public Banco(String nome){
        this.nome = nome;
    }


    public void incluirCliente (Cliente cliente){
        if (listaClientes == null) {
            listaClientes = new ArrayList<>();
        }
        listaClientes.add(cliente);
    }

    public String listarClientes (){
        StringBuffer sb = new StringBuffer();
        for (Cliente cliente : listaClientes) {
            sb.append(cliente.getNome() + ", CPF" + cliente.getCPF() + "\n");
        }
        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    
}
