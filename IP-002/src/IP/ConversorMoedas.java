package IP;

import java.util.Scanner;

	public class ConversorMoedas {
		public static void main (String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			double taxaReal = 0.2;
			
			double taxaEuro = 0.92;
			
			boolean continuar = true;
			
			while (continuar) {
				
			System.out.print("Insira a quantidade em dólares: ");
			double dolares = scanner.nextDouble();
			
			System.out.print("Escolha a moeda para conversão\n");
			System.out.print("1. Real\n");
			System.out.print("2. Euro\n");
			System.out.print("Digite o número da opção desejada: ");
			int moeda = scanner.nextInt();
			
			double conversao = 0;
			
			switch (moeda) {
				case 1:
					conversao = dolares * taxaReal;
					System.out.print("\nValor em real: R$" + conversao);
					break;
				case 2:
					conversao = dolares * taxaEuro;
					System.out.print("\nValor em euro: U$" + conversao);
					break;
				default:
					System.out.print("Opção inválida, tente novamente");
			}
			
			System.out.print("\nDeseja converter novo valor? Digite 'sim' ou 'não'\n");;
			String opcao = scanner.next().toLowerCase();
			
			continuar = opcao.equals("sim");
			}
		
			scanner.close();
		}

	}