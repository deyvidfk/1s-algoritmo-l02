/*
Criar um programa para calcular o valor da multa a ser paga de anuidade de uma
associação. A anuidade deve ser paga no mês de janeiro. Por mês, é cobrado 5% de
juros (com juros sobre juros). Por exemplo, uma associação de R$100 paga em janeiro,
custa R$ 100; em fevereiro, custa R$105; em março, custa R$110,25; e, em dezembro,
R$171,03. 
 */
package listaexercicios1;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author dev-004
 */
public class Exerc8 {

    public static void main(String[] args) {
        Scanner console = new Scanner(in);

        int mes;
        double valor, multa = 0.05;
        System.out.println("Informe o valor da anuidade: ");

        valor = console.nextDouble();
        System.out.println("Informe o mês de pagamento: ");
        mes = console.nextInt();
        /* supondo que o mês fornecido é válido. Se quiser verificar vide ex. 6 */
        switch (mes) {
            case 12:
                valor *= (1 + multa);
            case 11:
                valor *= (1 + multa);
            case 10:
                valor *= (1 + multa);
            case 9:
                valor *= (1 + multa);
            case 8:
                valor *= (1 + multa);
            case 7:
                valor *= (1 + multa);
            case 6:
                valor *= (1 + multa);
            case 5:
                valor *= (1 + multa);
            case 4:
                valor *= (1 + multa);
            case 3:
                valor *= (1 + multa);
            case 2:
                valor *= (1 + multa);
            default:
                break;
        }
        /* note a ausência do break em cada case */
        System.out.format("Valor a pagar no mês %d: %.2f\n", mes, valor);
    }
}
