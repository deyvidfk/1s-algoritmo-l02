/*
*Crie um programa que exibe se um dia é dia útil, fim de semana ou dia inválido dado
*o número referente ao dia. Considere que domingo é o dia 1 e sábado é o dia 7. 
 */
package listaexercicios1;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author dev-004
 */
public class Exerc2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(in);

        int dia = 0, d;

        System.out.println("Domingo-1 \n segunda-2 \n terca- 3 \n quarta-4 \n quinta-5 \n sexta-6 \n sabado-7 \n:");

        System.out.println("Escolha um dia(1 a 7):");

        d = console.nextInt();

        switch (d) {
            case 1:
                System.out.println("Dia:Domingo-Final de semana");
                break;
            case 2:
                System.out.println("Dia:Segunda feira - Dia util");
                break;
            case 3:
                System.out.println("Dia:Terca feira - Dia util");
                break;
            case 4:
                System.out.println("Dia:Quarta feira - Dia util");
                break;
            case 5:
                System.out.println("Dia:Quinta feira - Dia util");
                break;
            case 6:
                System.out.println("Dia:Sexta feira - Dia util");
                break;
            case 7:
                System.out.println("Dia:Sabado- Final de semana");
                break;
            default:
                System.out.println("Dia invalido");
        }
    }
}
