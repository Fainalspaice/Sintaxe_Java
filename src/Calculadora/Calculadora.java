package Calculadora;

import java.util.Scanner;
import java.util.concurrent.BrokenBarrierException;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite Seu numero:");
        double nume1 = input.nextDouble();

        System.out.println("Digite Seu operador:");
        char operador = input.next().charAt(0);

        System.out.println("Digite Seu outro numero:");
        double nume2 = input.nextDouble();


        double resultado = 0;
        boolean operacaoValida = true; // esse metado é para ver se o resultado digitado sera possivel fazer o calculo

        switch (operador) { //** esse metado serve para descobrir de qual eguação matematica deve ocorrer o calculo
            case '+':
                resultado = nume1 + nume2;
                break;
            case '-':
                resultado = nume1 - nume2;
                break;
            case '*':
                resultado = nume1 * nume2;
                break;
            case '/':
                resultado = nume1 / nume2;
                break;
            default:
            System.out.println("erro");
            operacaoValida = false;// a operação so sera possivel se todos os requisitos estejam corretos numero, operador, outro numero
        }
        if (operacaoValida) {
        System.out.println("Resultado: " + resultado);}
    }


}



