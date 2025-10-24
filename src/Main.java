import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n----- MENU DE ATIVIDADES -----");
            System.out.println("1 - Atividade 01: Sistema Escolar");
            System.out.println("2 - Atividade 02: Conversor de Temperatura");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            // Garante que a entrada seja um número inteiro
            if (scan.hasNextInt()) {
                opcao = scan.nextInt();

                switch (opcao) {
                    case 1 -> Atividade01.executar();
                    case 2 -> Atividade02.executar();
                    case 0 -> System.out.println("Encerrando o programa...");
                    default -> System.out.println("Opção inválida! Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida! Por favor, digite um número.");
                scan.next(); // Limpa o buffer do scanner
            }
        }

        scan.close();
    }
}