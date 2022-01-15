package dio.cognizant21.desafio1;

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

    }

    @Test
    void depositoFracasso() {

    }

    @Test
    void saqueSucesso() {

    }

    @Test
    void saqueFracasso() {
        
    }

    @Test
    void transferenciaSucesso() {

    }

    @Test
    void transferenciaFracasso1() {
        
    }

    @Test
    void transferenciaFracasso2() {
        
    }

}
