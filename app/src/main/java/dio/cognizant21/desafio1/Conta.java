package dio.cognizant21.desafio1;

public class Conta {

    protected static int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;

    protected String titular;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    public void depositar (int valor) {
        this.saldo += valor;
    };

    public boolean sacar(int valor) {
        if(this.saldo > valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    };

    public boolean transferir(int valor, Conta contaDestino) {
        if (this.saldo > valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            return true;
        } else {
            return false;
        }
    };
}
