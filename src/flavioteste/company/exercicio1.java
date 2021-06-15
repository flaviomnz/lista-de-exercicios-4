package flavioteste.company;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        //Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
        int[] numero = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i < numero.length; i++){
            System.out.println(" Digite cinco números. " + (i+1));
            numero[i] = scanner.nextInt();
        }
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }
    }
}