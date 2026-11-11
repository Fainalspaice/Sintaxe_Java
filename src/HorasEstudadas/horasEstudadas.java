package HorasEstudadas;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class horasEstudadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm");



        System.out.println("Digite inicio dos estudos no formato HH:mm :");
        String Inicio = sc.nextLine();

        System.out.println("Digite fim dos estudos no formato HH:mm : ");
        String Fim = sc.nextLine();

        System.out.println("Digite a materia:");
        String materia = sc.next();


        // Converte as Strings para LocalTime
        LocalTime inicio = LocalTime.parse(Inicio, formatador);
        LocalTime fim = LocalTime.parse(Fim, formatador);

        // Calcula a duração entre os dois horários
        Duration duracao = Duration.between(inicio, fim);

        long horas = duracao.toHours();
        long minutos = duracao.toMinutes() % 60;

        System.out.println("Você estudou: " + horas + " horas e " + minutos + " minutos de " + materia);


        // Explicação básica:

        // 1. Scanner: Lê o texto digitado pelo usuário no console (no formato HH:mm).
        // 2. LocalTime.parse(): Transforma o texto digitado em um objeto de tempo do Java.
        // 3. Duration.between(): Calcula o intervalo exato entre o horário de início e o de fim.
        // 4. toHours() e toMinutes(): Extraem os valores numéricos da diferença para você exibir o resultado formatado.
    }
}














