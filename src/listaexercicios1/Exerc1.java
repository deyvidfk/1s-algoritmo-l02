/*
 * Crie um programa que verifica se um número inteiro informado pelo usuário é
 * divisível por 3.
 */
package listaexercicios1;
import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author dev-004
 */
public class Exerc1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(in);

        System.out.println("Informe o número: ");

        int _number = console.nextInt();

        if (_number % 3 == 0) {
            System.out.format("O número %d é divisivel por 3", _number);
        } else {
            System.out.format("O número %d não é divisivel por 3", _number);
        }
    }
}
