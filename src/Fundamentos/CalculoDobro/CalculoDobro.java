package Fundamentos.CalculoDobro;

public class CalculoDobro {
    public static void main(String[] args) {


        int resultado = calcularDobro(8);

        System.out.println("Dobro: " + resultado);
    }

    public static int calcularDobro(int a) {
        return a * 2;
    }
}

