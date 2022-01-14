package dio.cognizant21.desafio1;

public class ContaCorrente extends Conta {
    
    public ContaCorrente(String titular) {
        super.titular = titular;
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = Conta.SEQUENCIAL++;
        super.saldo = 0;
    }
}
