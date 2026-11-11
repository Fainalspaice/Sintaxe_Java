package HorasEstudadas;

import java.time.Duration;
import java.util.Scanner;

public class HorasJogadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as horas jogadas no formato HH:mm:");
        String entrada = sc.nextLine();

        String[] partes = entrada.split(":");
        int horasJogadas = Integer.parseInt(partes[0]);
        int minutosJogadas = Integer.parseInt(partes[1]);

        Duration jogadas = Duration.ofHours(horasJogadas).plusMinutes(minutosJogadas);
        Duration dia = Duration.ofHours(24);

        if (horasJogadas < 0 || horasJogadas > 24 || minutosJogadas < 0 || minutosJogadas >= 60
                || jogadas.compareTo(dia) > 0) {
            System.out.println("Digite um tempo entre 00:00 e 24:00.");
            return;
        }

        Duration restantes = dia.minus(jogadas);
        long horas = restantes.toHours();
        long minutos = restantes.toMinutesPart();

        System.out.println("Horas jogadas: " + entrada);
        System.out.printf("Tempo restante no dia: %02d:%02d%n", horas, minutos);
    }
}
