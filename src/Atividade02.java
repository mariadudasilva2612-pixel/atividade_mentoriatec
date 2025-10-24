import java.util.Scanner;

public class Atividade02 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Atividade 02: Conversor de Temperatura ---");
        System.out.print("Digite a temperatura em graus Celsius (°C): ");

        // Validação para garantir que a entrada é um número
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
            System.out.print("Digite a temperatura em graus Celsius (°C): ");
            scanner.next(); // Limpa o buffer
        }
        double celsius = scanner.nextDouble();

        // Fórmulas de conversão
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("\n--- Resultados da Conversão ---");
        System.out.printf("Celsius:    %.2f °C\n", celsius);
        System.out.printf("Fahrenheit: %.2f °F\n", fahrenheit);
        System.out.printf("Kelvin:     %.2f K\n", kelvin);
        System.out.println("-----------------------------");
    }
}