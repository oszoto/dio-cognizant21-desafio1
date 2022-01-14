package dio.cognizant21.desafio1;

import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class Cliente {
    private String nome;
    private List<Conta> contas;

    public Cliente(String nome) {
        this.nome = nome;
        this.contas = new LinkedList<Conta>();
    }

    public Conta encontrarConta(int numero, int agencia) {
        Conta contaAtual;
        ListIterator<Conta> iteradorContas = this.contas.listIterator();
        while (iteradorContas.hasNext()) {
            contaAtual = iteradorContas.next();
            if(contaAtual.numero == numero && contaAtual.agencia == agencia) {
                return contaAtual;
            }
        }
        return null;
    };

    public void abrirContaCorrente() {
        contas.add(new ContaCorrente(nome));
    };

    public boolean fecharContaCorrente() {
        return true;
    };

    public void abrirContaPoupanca() {};

    public boolean fecharContaPoupanca() {
        return true;
    };
}
