package flavioteste.company;

import java.util.Scanner;

public class exercicio2 {
    public static void main (String[] args){
    //Faça um Programa que leia um vetor de 5 números reais e mostre-os na ordem inversa.

        int[] numerosReais = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i < numerosReais.length;i++){
            System.out.println(" Digite cinco números: " + "("+(i+1)+")");
            numerosReais[i] = scanner.nextInt();
        }
        for (int i=4; i >= 0; i--){
            System.out.println(numerosReais[i]);
        }

    }
}
