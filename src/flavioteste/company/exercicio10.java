package flavioteste.company;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args){
        //Faça um Programa que leia dois vetores com 10 elementos cada. Gere um terceiro vetor de 20 elementos, cujos
        // valores deverão ser compostos pelos elementos intercalados dos dois outros vetores.

        float[] vetor1 = new float[3];
        float[] vetor2 = new float[3];
        float[] vetoresUnidos = new float[vetor1.length+vetor2.length];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vetor 1");
        for (int i=0; i<vetor1.length; i++){
            System.out.println((i+1) + " Numero");
            vetor1[i] = scanner.nextFloat();
        }
        System.out.println("Vetor 2");
        for (int i=0; i<vetor2.length; i++){
            System.out.println((i+1) + " Numero");
            Scanner myObj = new Scanner(System.in);
            vetor2[i] = myObj.nextFloat();
        }
        System.out.println("Vetores Unificados");
        int n=0;
        int j=0;
        while (n<vetoresUnidos.length){
            vetoresUnidos[n] = vetor1[j];
            n++;
            vetoresUnidos[n] = vetor2[j];
            n++;
            j++;
        }
        for (int i=0; i< vetoresUnidos.length; i++){
            System.out.print(vetoresUnidos[i] + ", ");
        }
    }
}


