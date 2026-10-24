import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Escolha Personal ou Fisioterapeuta e complete 2 testes.
 * Um deles deve obrigatoriamente verificar o pagamento (registrarPagamento).
 */
public class ProfissionalTest {

    @Test
    void testaAdicionarAulasAcimaMaximo() {
        // Arrange
        Personal personal = new Personal("Ana", "P001");
        // Act — troque/complete conforme a classe escolhida
        double aulas = personal.addAulaAvulsa(31.0);
        // Assert
        assertEquals(30.0, aulas, 0.001,
                "Esse teste verifica se não permite adicionar aulas acima do máximo");
    }

    @Test
    void testaRegistroPagamento() {
        // Arrange
        Personal personal = new Personal("Ana", "P001");
        // Act — troque/complete conforme a classe escolhida
        personal.addAulaAvulsa(10.0);
        double pagamento = personal.registrarPagamento();

        // Assert
        assertEquals(4231.5, pagamento, 0.001,
                "Esse teste verifica o registro do pagamento");
    }

    // TODO: criar 2 testes unitários (AAA + mensagem na asserção)
    // TODO: um deles deve testar registrarPagamento
}
