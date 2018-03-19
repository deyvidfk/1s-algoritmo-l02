/*
. Crie um programa que simule uma calculadora simples capaz de realizar as operações
básicas. O programa deve receber 3 dados: dois números e um caractere. Este caractere
poderá ser '+', '-', ‘*' ou '/' , e representarão a operação matemática que você deseja
realizar entre os números.
 */
package listaexercicios1;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author dev-004
 * http://www.cprogressivo.net/2013/02/Como-criar-uma-calculadora-em-linguagem-C.html
 */
public class Exerc10 {

    public static void main(String[] args) {
        Scanner console = new Scanner(in);

        float num1,
                num2;
        char oper;

        do {
            System.out.flush();
            System.out.println("\t\tCalculadora\n\n");

            System.out.println("Operacoes disponiveis\n");
            System.out.println("'+' : soma\n");
            System.out.println("'-' : subtracao\n");
            System.out.println("'*' : multiplicao\n");
            System.out.println("'/' : divisao\n");
            System.out.println("'%%' : resto da divisao\n");

            System.out.println("\nDigite a expressao na forma: numero 1 operador numero 2\n");
            System.out.println("Exemplos: 1 + 1 ,  2.1 * 3.1\n");
            System.out.println("Para sair digite: 0 0 0\n");

            num1 = console.nextFloat();
            oper = console.next().charAt(0);
            num2 = console.nextFloat();

            System.out.flush();

            System.out.format("Calculando: %.2f %c %.2f = ", num1, oper, num2);

            switch (oper) {
                case '+':
                    System.out.format("%.2f\n\n", num1 + num2);
                    break;

                case '-':
                    System.out.format("%.2f\n\n", num1 - num2);
                    break;

                case '*':
                    System.out.format("%.2f\n\n", num1 * num2);
                    break;

                case '/':
                    if (num2 != 0) {
                        System.out.format("%.2f\n\n", num1 / num2);
                    } else {
                        System.out.println("Nao existe divisao por 0\n\n");
                    }
                    break;

                case '%':
                    System.out.format("%d\n\n", (int) num1 % (int) num2);
                    break;

                default:
                    if (num1 != 0 && oper != '0' && num2 != 0) {
                        System.out.println(" Operador invalido\n\n ");
                    } else {
                        System.out.println(" Fechando calculadora!\n ");
                    }
            }

        } while (num1 != 0 && oper != '0' && num2 != 0);
    }
}
