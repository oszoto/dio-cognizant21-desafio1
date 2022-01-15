package dio.cognizant21.desafio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {
    Cliente cliente;

    @BeforeEach
    void setUp() {
        cliente = new Cliente("Teste");
    }

    @Test
    void verificarNomeDoCliente() {
        assertEquals("Teste", cliente.getNome());
    }

    @Test
    void encontrarContaFracasso() {
        assertEquals(null, cliente.encontrarConta(5, 1));
    }

    @Test
    void encontrarContaSucesso1() {
        cliente.abrirContaCorrente();
        assertEquals(cliente.encontrarConta(1, 1).titular, cliente.getNome());
    }

    @Test 
    void encontrarContaSucesso2() {
        cliente.abrirContaCorrente();
        cliente.fecharConta(1, 1);
        cliente.abrirContaPoupanca();
        assertEquals(cliente.encontrarConta(2, 1).titular, cliente.getNome());
    }
}
