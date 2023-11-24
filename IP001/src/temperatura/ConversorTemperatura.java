package temperatura;
import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.print("Digite a temperatura: ");
            double temperatura = scanner.nextDouble();

            System.out.println("Escolha a unidade de origem:");
            System.out.println("1 - Celsius");
            System.out.println("2 - Fahrenheit");
            System.out.println("3 - Sair");
            System.out.print("Digite o número da unidade desejada: ");
            int unidadeOrigem = scanner.nextInt();

            double temperaturaConvertida = 0;

            switch (unidadeOrigem) {
                case 1:
                    temperaturaConvertida = celsiusParaFahrenheit(temperatura);
                    System.out.println("A temperatura em Fahrenheit é: " + temperaturaConvertida + "°F");
                    break;
                case 2:
                    temperaturaConvertida = fahrenheitParaCelsius(temperatura);
                    System.out.println("A temperatura em Celsius é: " + temperaturaConvertida + "°C");
                    break;
                case 3:
                    sair = true;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            if (!sair) {
                System.out.print("Deseja realizar outra conversão? (Digite 1 para sim ou 2 para sair): ");
                int continuar = scanner.nextInt();
                if (continuar != 1) {
                    sair = true;
                    System.out.println("Saindo...");
                }
            }
        }

        System.out.println("Programa encerrado.");

        scanner.close();
    }

    // Métodos de conversão de temperatura
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

