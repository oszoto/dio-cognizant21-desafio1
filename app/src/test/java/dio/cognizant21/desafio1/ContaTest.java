package dio.cognizant21.desafio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContaTest {
    Conta conta1;
    Conta conta2;

    @BeforeEach
    void setUp() {
        conta1 = new ContaCorrente("Teste");
        conta2 = new ContaPoupanca("Teste");
    }

    @Test
    void depositoSucesso() {
        conta1.depositar(50f);
        assertEquals(50f, conta1.getSaldo());
    }

    @Test
    void saqueSucesso() {
        conta1.depositar(50.20);
        assertTrue(conta1.sacar(20.23));
        assertEquals(50.20 - 20.23, conta1.getSaldo());
    }

    @Test
    void saqueFracasso() {
        assertFalse(conta1.sacar(500.00));
        assertEquals(0, conta1.getSaldo());
    }

    @Test
    void transferenciaSucesso() {
        conta1.depositar(30);
        assertTrue(conta1.transferir(30, conta2));
        assertEquals(0, conta1.getSaldo());
        assertEquals(30, conta2.getSaldo());
    }

    @Test
    void transferenciaFracasso1() {
        assertFalse(conta1.transferir(50, conta2));
        assertEquals(0, conta1.getSaldo());
        assertEquals(0, conta2.getSaldo());
    }

    @Test
    void transferenciaFracasso2() {
        conta2 = null;
        conta1.depositar(20);
        assertFalse(conta1.transferir(20, conta2));
    }

    @Test
    void verificarExtrato() {
        List<String> expected = new LinkedList<String>();
        expected.add("+ R$ 50.00");
        expected.add("- R$ 20.00");
        expected.add("+ R$ 25.00");
        conta1.depositar(50);
        conta1.sacar(20);
        conta1.depositar(25);
        assertLinesMatch(expected, conta1.getExtrato());
    }

}
