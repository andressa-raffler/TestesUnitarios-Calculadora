import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VerificadorPalindromoTest {

    VerificadorPalindromo verificadorPalindromo = new VerificadorPalindromo();

    @Test
    public void validarPalindromoTest(){
        boolean expected = true;
        boolean result = verificadorPalindromo.ehPalindromo("Subi no onibus");
        Assertions.assertEquals(expected, result);
    }

}
