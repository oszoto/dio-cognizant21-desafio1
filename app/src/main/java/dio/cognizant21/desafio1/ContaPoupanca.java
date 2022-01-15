package dio.cognizant21.desafio1;

public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(String titular) {
        super(titular);
    };

    @Override
    public void imprimirExtrato() {
        System.out.println("==== Extrato da Conta Poupanca ====");
        super.imprimirCorpoDoExtrato();
    };
}
