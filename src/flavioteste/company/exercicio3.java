package flavioteste.company;

import java.util.Scanner;

public class exercicio3 {
    public static void main (String[] args){
        //Faça um Programa que leia 4 notas, mostre as notas e a média na tela.

        float[] notas = new float[4];
        float media = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i < notas.length; i++){
            System.out.println(" Digite as 4 notas: " + "("+(i+1)+")");
            notas[i] = scanner.nextFloat();
        }
        for (int i=0; i < notas.length; i++){
            media = notas[i] + notas[i];
            System.out.println("Media"+"("+(i+1)+"):" +  media/4);
        }
    }
}
