import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ler as horas de início e fim
        System.out.println("Horas de início:");
        int horasiniciais = sc.nextInt();
        System.out.println("Horas de fim:");
        int horasfinais = sc.nextInt();

        int duracao;

        // Se o horário de início for menor que o horário de fim (mesmo dia)
        if (horasiniciais < horasfinais) {
            duracao = horasfinais - horasiniciais; // duração simples
        }
        // Se o jogo começou em um dia e terminou no outro
        else {
            duracao = 24 - horasiniciais + horasfinais; // calcula o tempo restante do dia e soma o do próximo
        }

        System.out.println("A duração do jogo foi: " + duracao + " horas");

        sc.close(); // fechar o Scanner
    }
}
