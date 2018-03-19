/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios1;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author Deyvid Souza
 */
public class ListaExercicios1 {

    Scanner console;

    public ListaExercicios1() {
        this.console = new Scanner(in);
    }

    public static void main(String[] args) {
        new ListaExercicios1().exercicio3();
    }

    public void exercio1() {

        System.out.println("Informe o número: ");
        Integer _number = console.nextInt();
        if (_number % 3 == 0) {
            System.out.println("O número " + _number + " é divisivel por 3");
        } else {
            System.out.println("O número " + _number + " não é divisivel por 3");
        }
    }

    public void exercio2() {
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

    public void exercicio3() {

        int valor, nota2, nota5, nota10, nota50, nota100, r;
        System.out.println("Caixa eletrônico\n\n");
        do {
            System.out.println("DIGITE O VALOR DO SAQUE: ");
            valor = console.nextInt();
            if (valor < 10 || valor > 600) {
                System.out.println("Valor invalido, digite um valor entre 10 e 600.\n\n");
            }
        } while (valor < 10 || valor > 600);

        nota100 = valor / 100;
        r = valor % 100;
        nota50 = r / 50;
        r = r % 50;
        nota10 = r / 10;
        r = r % 10;
        nota5 = r / 5;
        r = r % 5;
        nota2 = r / 2;
        r = r % 2;
        System.out.println("Nota de 100:" + nota100);
        System.out.println("Nota de 50:" + nota50);
        System.out.println("Nota de 10:" + nota10);
        System.out.println("Nota de 5:" + nota5);
        System.out.println("Nota de 2: " + nota2);

    }

    public void exercicio4() {
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
