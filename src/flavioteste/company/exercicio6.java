package flavioteste.company;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        //Faça um Programa que peça as quatro notas de 10 alunos, calcule e
        // armazene num vetor a média de cada aluno, imprima o número de alunos com média maior ou igual a 7.0.

        float[][] notasAluno = new float[10][4];
        float[] mediaAlunos = new float[10];
        float alunosMedia7 = 0;

        // declaração padrão + alunos.
        for (int i = 0; i < notasAluno.length; i++) {
            System.out.println("Aluno" + "(" + (i + 1) + "):");
            for (int j = 0; j < 4; j++) {
                Scanner scanner = new Scanner(System.in);
                notasAluno[i][j] = scanner.nextFloat();
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                mediaAlunos[i] = mediaAlunos[i] + notasAluno[i][j]; // atribuindo a media com a soma de I e J.
            }
            mediaAlunos[i] = (mediaAlunos[i] / 4); // tirando a media
        }

        for (int i=0; i<10; i++){
            if(mediaAlunos[i] >= 7){
                alunosMedia7++;
            }
        }
        System.out.println("Quantidade de alunos aprovados:" + " " + alunosMedia7);
    }
}

