/*
Construir um programa para identificar quantos dias há em um mês, sabendo o mês e
o ano
 */
package listaexercicios1;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author dev-004
 */
public class Exerc4 {

    public static void main(String[] args) {
        Scanner console = new Scanner(in);

        int mes, dias = 31;

        System.out.println("Digite o mes [1-12]: ");
        mes = console.nextInt();

        if (mes > 12 || mes < 1) {
            System.out.println("Mes invalido");
        } else {
            switch (mes) {
                // fevereiro: subtraímos 2 dias aqui e 1 dia no próximo case
                case 2:
                    dias -= 2;

                //meses que possuem 30 dias: só subtraímos 1 dia
                case 4:
                case 6:
                case 9:
                case 11:
                    dias--;
            }
        }

        System.out.println("O mes " + mes + " possui " + dias + " dias");
    }
}
