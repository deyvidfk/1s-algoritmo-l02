/*
Criar um programa para identificar se um dia da semana (numerados de 1 a 7) é dia de
semana, fim de semana ou um dia inválido.
 */
package listaexercicios1;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author dev-004
 */
public class Exerc6 {

    public static void main(String[] args) {
        Scanner console = new Scanner(in);

        int dia;

        System.out.println("Entre com um numero: ");
        dia = console.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Numero invalido");
        }
    }
}
