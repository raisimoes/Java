package calculadora;
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
        	System.out.println("\n------------- Calculadora Simples ------------ \n");
          
        	System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            System.out.println("Menu de operações:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");
            System.out.print("Digite o número referente à operação desejada: ");
            int escolha = scanner.nextInt();

            double resultado = 0;

            switch (escolha) {
                case 1:
                    resultado = numero1 + numero2;
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    break;
                case 4:
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        System.out.println("Erro! Divisão por zero é inválida.");
                        continue;
                    }
                    break;
                case 5:
                    System.out.println("\nSaindo...");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            if (!sair) {
                System.out.println("O resultado é: " + resultado + "\n");
                System.out.print("Deseja fazer outra operação? Digite 1 para sim ou 2 para encerrar: ");
                int continuar = scanner.nextInt();
                if (continuar != 1) {
                    sair = true;
                    System.out.println("\nSaindo...");
                }
            }
        }

        System.out.println("Programa encerrado.");

        scanner.close();
    }
}

