package Fundamentos.CalcularMedia;

public class CalculoMedia {
    public static void main(String[] args) {

        double resultado = calcularMedia(7.5, 8.0 , 9.0);
        System.out.println(resultado);
    }

    public static double calcularMedia(double a, double b, double c) {
        return a + b + c / 3;
    }

}



