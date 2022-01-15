package dio.cognizant21.desafio1;

import java.util.List;
import java.util.LinkedList;

public class Conta {

    protected static int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;

    protected String titular;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected List<String> extrato;

    public Conta(String titular) {
        this.titular = titular;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL++;
        this.saldo = 0.00;
        this.extrato = new LinkedList<String>();
    }

    public int getAgencia() {
        return this.agencia;
    }
    public int getNumero() {
        return this.numero;
    }
    public double getSaldo() {
        return this.saldo;
    }

    protected void logTransacao(double valor, char sinal) {
        if (sinal == '+' || sinal == '-') {
            String mensagem = String.format("%c %.2f", sinal, valor);
            this.extrato.add(mensagem);
        }
    };

    public void imprimirCorpoDoExtrato() {
        this.extrato.forEach((String transacao) -> {
            System.out.println(transacao);
        });
        System.out.println("----------\nSaldo da conta = " + this.saldo);
    };

    public void depositar (double valor) {
        this.saldo += valor;
        this.logTransacao(valor, '+');
    };

    public boolean sacar(double valor) {
        if(this.saldo > valor) {
            this.saldo -= valor;
            this.logTransacao(valor, '-');
            return true;
        } else {
            return false;
        }
    };

    public boolean transferir(double valor, Conta contaDestino) {
        if (this.saldo > valor && contaDestino != null) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            return true;
        } else {
            return false;
        }
    };
}
