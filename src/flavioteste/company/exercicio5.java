package flavioteste.company;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        //Faça um Programa que leia 10 números inteiros e armazene-os num vetor.
        // Armazene os números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores.

        System.out.println(" Digite 10 números inteiros: ");
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] par = new int[10];
        int[] impares = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
            par[i] = -1;
            impares[i] = -1;
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                par[i] = numeros[i];
            } else {
                impares[i] = numeros[i];
            }
        }

        System.out.println("\nPares: ");
        for (int i = 0; i < numeros.length; i++) {
            if (par[i] != -1) {
                System.out.print("\n"+par[i]);
            }
        }

        System.out.print("\nImpares: ");
        for (int i = 0; i < numeros.length; i++) {
            if (impares[i] != -1) {
                System.out.print("\n"+impares[i]);
            }
        }

        System.out.print("\nNumeros digitados: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("\n"+numeros[i]);
        }
    }
}





