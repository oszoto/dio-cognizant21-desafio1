package dio.cognizant21.desafio1;

public class ContaCorrente extends Conta {
    
    public ContaCorrente(String titular) {
        super(titular);
    }

    public void imprimirExtrato() {
        System.out.println("==== Extrato da Conta Corrente ====");
        super.imprimirCorpoDoExtrato();
    }
}
