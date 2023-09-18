import java.util.Scanner;
import java.util.Locale;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro valor: ");
        int valorUm = terminal.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valorDois = terminal.nextInt();

        try {
            contar(valorUm, valorDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }
    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;
        for (int indice = 1; indice <= contagem; indice++) {
            System.out.println("Imprimindo valor " + indice);
        }
    }
}
