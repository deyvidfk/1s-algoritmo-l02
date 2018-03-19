/*
Criar um programa para identificar se um mês digitado pelo usuário é de alta ou baixa
temporada (considerar os seguintes meses como alta temporada: dezembro a fevereiro,
junho e julho).
 */
package listaexercicios1;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author dev-004
 */
public class Exerc5 {

    public static void main(String[] args) {
        Scanner console = new Scanner(in);

        int mes;
        System.out.println("Informe o mês: ");

        mes = console.nextInt();
        while ((mes < 1) || (mes > 12)) {
            System.out.println("Mês inválido. Reinforme o mês: ");
            mes = console.nextInt();
        }
        switch (mes) {
            case 12:
            case 1:
            case 2:
            case 6:
            case 7:
                System.out.println("Alta temporada\n");
                break;
            default:
                System.out.println("Baixa temporada\n");
        }

    }
}
