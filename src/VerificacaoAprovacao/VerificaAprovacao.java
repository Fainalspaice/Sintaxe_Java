package VerificacaoAprovacao;

import java.util.Scanner;

public class VerificaAprovacao {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua nota:");
        double nota = input.nextDouble();

        boolean resultado = notaAprovado(nota);
        if (resultado == true) {
            System.out.printf("Resultado: Aprovado");
        } else  {
            System.out.printf("Resultado: Reprovado");
        }
    }
    public static boolean notaAprovado(double nota) {
        if (nota >= 7) {
            return true;
        }else {
            return false;
        }

    }



}



