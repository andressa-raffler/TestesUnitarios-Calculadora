public class CalculadoraNumeroPrimo {

    public boolean ehPrimo(Integer numero) throws NumeroInvalidoException{



        if(numero == 0 || numero == 1){
            throw new NumeroInvalidoException("Número inválido, nao é possível verificar se é primo");
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
