package flavioteste.company;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args){
        //Faça um Programa que leia um vetor A com 10 números
        //inteiros, calcule e mostre a soma dos quadrados dos elementos do vetor.

        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int somaQuadrado = 0;
        for (int i=0; i<vetorA.length; i++){
            System.out.println("Digite um numero"+"("+(i+1)+")");
            Scanner myObj = new Scanner(System.in);
            vetorA[i] = myObj.nextInt();
            somaQuadrado += (vetorA[i] * vetorA[i]); // <--- o código.
        }
        System.out.println("Soma total: " + somaQuadrado);
    }
}
