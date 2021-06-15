package flavioteste.company;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        //Faça um Programa que peça a idade e a altura
        // de 5 pessoas, armazene cada informação no seu respectivo vetor.
        // Imprima a idade e a altura na ordem inversa a ordem lida.
        float[][] idadeAltura = new float[5][2];
        Scanner scanner = new Scanner(System.in);

        // declaração + scanner padrão.
        for (int i = 0; i < idadeAltura.length; i++) {
            System.out.println("Pessoa - "+"("+(i+1)+")"+"\nIdade:");
            idadeAltura[i][0] = scanner.nextFloat();
            System.out.println("\nAltura:");
            idadeAltura[i][1] = scanner.nextFloat();
        }
        // ordem inversa
        for (int i = 4; i > -1; i--) {
            System.out.println("Pessoa " + (i + 1) + "\nIdade: " + idadeAltura[i][0] + "\nAltura:" + idadeAltura[i][1]);
        }
    }
}
