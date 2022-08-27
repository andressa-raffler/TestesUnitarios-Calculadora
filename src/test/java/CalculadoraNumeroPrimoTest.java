import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraNumeroPrimoTest {

    CalculadoraNumeroPrimo calculadoraNumeroPrimo = new CalculadoraNumeroPrimo();

    @Test
    public void testNumeroPrimo() throws NumeroInvalidoException {
        boolean expected = false;
        boolean result = calculadoraNumeroPrimo.ehPrimo(0);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testNumeroPrimoInvalido() {
        Assertions.assertThrows(NumeroInvalidoException.class,
                () -> calculadoraNumeroPrimo.ehPrimo(null));
    }

}
