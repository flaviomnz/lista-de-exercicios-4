package flavioteste.company;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        //Faça um Programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.
        char[] caracteres = new char[10];
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        int vogaisSoma = 0;
        Scanner scanner = new Scanner(System.in);

        // declaração padrão
        System.out.println(" Digite 10 letras.");
        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = scanner.next().charAt(0);
        }

        // coração do código
        for (int i = 0; i < caracteres.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (caracteres[i] == vogais[j]) { // atribuindo as letras do vetor [i] para o vetor [j], onde j é aeiou.
                    caracteres[i] = ' ';
                    vogaisSoma++;
                }
            }
        }
        // print arrumadinho pra ficar bonito na tela :)
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] != ' ') {
                System.out.print(caracteres[i] + ", ");

            }
        }

        System.out.println("Total de Consoantes: " + (10-vogaisSoma));
    }
}


