/*
Crie um programa para informar quais e quantas notas são necessárias para entregar o
mínimo de cédulas para um determinado valor informado pelo usuário, Considere
notas de R$ 100, R$ 50, R$ 10 e R$ 5 e R$ 1. Seu programa deve mostrar apenas as notas
utilizadas. Por exemplo, ao solicitar R$18, o programa deve informar apenas a seguinte
informação (note que não foram exibidas informações sobre as demais cédulas):
1 nota(s) de R$ 10.
1 nota(s) de R$ 5.
3 nota(s) de R$ 1.
 */
package listaexercicios1;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author dev-004
 */
public class Exerc3 {

    public static void main(String[] args) {
        Scanner console = new Scanner(in);
        double VALOR_MINIMO = 1.0;
        double VALOR_MAXIMO = 600;
        int valor, nota1, nota2, nota5, nota10, nota50, nota100, r;
        System.out.println("Caixa eletrônico\n\n");
        do {
            System.out.println("DIGITE O VALOR DO SAQUE: ");
            valor = console.nextInt();
            if (valor < VALOR_MINIMO || valor > VALOR_MAXIMO) {
                System.out.println("Valor invalido, digite um valor entre 10 e 600.\n\n");
            }
        } while (valor < VALOR_MINIMO || valor > VALOR_MAXIMO);

        nota100 = valor / 100;
        r = valor % 100;
        nota50 = r / 50;
        r = r % 50;
        nota10 = r / 10;
        r = r % 10;
        nota5 = r / 5;
        r = r % 5;
        //nota2 = r / 2;
        nota1 = r / 1;

        r = r % 2;
        if (nota100 > 0) {
            System.out.println("Nota de 100:" + nota100);
        }
        if (nota50 > 0) {
            System.out.println("Nota de 50:" + nota50);
        }
        if (nota10 > 0) {
            System.out.println("Nota de 10:" + nota10);
        }
        if (nota5 > 0) {
            System.out.println("Nota de 5:" + nota5);
        }
        // System.out.println("Nota de 2: " + nota2);
        if (nota1 > 0) {
            System.out.println("Nota de 1: " + nota1);
        }
    }
}
