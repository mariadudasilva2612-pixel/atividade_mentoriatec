import java.util.Scanner;

public class Atividade01 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];

        System.out.println("\n--- Atividade 01: Cálculo de Médias Escolares ---");
        System.out.println("Por favor, insira as 8 notas anuais do aluno.");

        for (int i = 0; i < notas.length; i++) {
            double nota;
            do {
                System.out.printf("Digite a nota %d (entre 0 e 10): ", i + 1);
                // Validação para garantir que a entrada é um número
                while (!scanner.hasNextDouble()) {
                    System.out.println("Entrada inválida. Por favor, digite um número.");
                    System.out.printf("Digite a nota %d (entre 0 e 10): ", i + 1);
                    scanner.next(); // Limpa o buffer
                }
                nota = scanner.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida! O valor deve estar entre 0 e 10.");
                }
            } while (nota < 0 || nota > 10);
            notas[i] = nota;
        }

        // Calculando as médias bimestrais (assumindo 2 notas por bimestre)
        double mediaBim1 = (notas[0] + notas[1]) / 2;
        double mediaBim2 = (notas[2] + notas[3]) / 2;
        double mediaBim3 = (notas[4] + notas[5]) / 2;
        double mediaBim4 = (notas[6] + notas[7]) / 2;

        // Calculando as médias semestrais
        double mediaSem1 = (mediaBim1 + mediaBim2) / 2;
        double mediaSem2 = (mediaBim3 + mediaBim4) / 2;

        // Calculando a média final
        double mediaFinal = (mediaSem1 + mediaSem2) / 2;

        System.out.println("\n--- Resultados ---");
        System.out.printf("Média 1º Bimestre: %.2f\n", mediaBim1);
        System.out.printf("Média 2º Bimestre: %.2f\n", mediaBim2);
        System.out.printf("Média 3º Bimestre: %.2f\n", mediaBim3);
        System.out.printf("Média 4º Bimestre: %.2f\n", mediaBim4);
        System.out.println("--------------------");
        System.out.printf("Média 1º Semestre: %.2f\n", mediaSem1);
        System.out.printf("Média 2º Semestre: %.2f\n", mediaSem2);
        System.out.println("--------------------");
        System.out.printf("MÉDIA FINAL ANUAL: %.2f\n", mediaFinal);
        System.out.println("--------------------");

        // Não fechamos o scanner aqui para evitar problemas no loop do Main.java
    }
}