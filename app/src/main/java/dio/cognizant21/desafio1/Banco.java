package dio.cognizant21.desafio1;

import java.util.HashMap;

public class Banco {
    private String nome;
    private HashMap<String, Cliente> clientes;

    public Banco(String nome) {
        this.setNome(nome);
        this.clientes = new HashMap<String, Cliente>();
    };

    public String getNome() {
        return nome;
    };

    public void setNome(String nome) {
        this.nome = nome;
    };

    public boolean cadastrarCliente(String nomeDoCliente) {
        if(this.clientes.containsKey(nomeDoCliente)) {
            return false;
        } else {
            this.clientes.put(nomeDoCliente, new Cliente(nomeDoCliente));
            return true;
        }
    };

    public boolean descadastrarCliente(String nomeDoCliente) {
        if(this.clientes.containsKey(nomeDoCliente)) {
            this.clientes.remove(nomeDoCliente);
            return true;
        } else {
            return false;
        }
    };

    public Cliente encontrarCliente(String nomeDoCliente) {
        if (this.clientes.containsKey(nomeDoCliente)) {
            return clientes.get(nomeDoCliente);
        } else {
            return null;
        }
    };
}