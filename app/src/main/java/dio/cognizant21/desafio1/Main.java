package dio.cognizant21.desafio1;

public class Main {
    public static void main(String[] args) {
        Banco bancoTeste = new Banco("Banco 1");
        System.out.println("Banco cadastrado com sucesso: " + bancoTeste.getNome());

        bancoTeste.cadastrarCliente("Joao da Silva");
        bancoTeste.cadastrarCliente("Paulo das Neves");

        Cliente clienteTeste = bancoTeste.encontrarCliente("Paulo das Neves");
        System.out.println("Cliente cadastrado e encontrado: " + clienteTeste.getNome());

        clienteTeste.abrirContaCorrente();
        clienteTeste.abrirContaPoupanca();

        Conta contaTeste = clienteTeste.encontrarConta(2, 1);
        Conta contaTesteDestino = clienteTeste.encontrarConta(1, 1);
        System.out.println("Conta cadastrada e encontrada com sucesso: Numero: " + contaTeste.getNumero() + " Agencia: " + contaTeste.getAgencia());

        contaTeste.depositar(50.12345);
        contaTeste.transferir(24.31231, contaTesteDestino);
        contaTeste.sacar(10);
        contaTesteDestino.transferir(12.50, contaTeste);
        contaTeste.imprimirExtrato();
    }
}
