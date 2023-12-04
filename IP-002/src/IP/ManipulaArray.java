package IP;

import java.util.Scanner;
import java.util.Random;

public class ManipulaArray {
    
    private int[] array;

    public ManipulaArray(int tamanho) {
        array = new int[tamanho];
    }

    public void lerArrayDoUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os elementos do array separados por espaço:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    public void gerarArrayAleatorio() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public int calcularSoma() {
        int soma = 0;
        for (int elemento : array) {
            soma += elemento;
        }
        return soma;
    }

    public int encontrarMaiorValor() {
        int maior = array[0];
        for (int elemento : array) {
            if (elemento > maior) {
                maior = elemento;
            }
        }
        return maior;
    }

    public int encontrarMenorValor() {
        int menor = array[0];
        for (int elemento : array) {
            if (elemento < menor) {
                menor = elemento;
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        System.out.println("Digite o tamanho do array:");
        int tamanho = scanner.nextInt();
        ManipulaArray manipulaArray = new ManipulaArray(tamanho);

        manipulaArray.lerArrayDoUsuario();

        System.out.println("Array inserido:");
        for (int elemento : manipulaArray.array) {
            System.out.print(elemento + " ");
        }
        System.out.println();

        System.out.println("Soma dos elementos: " + manipulaArray.calcularSoma());
        System.out.println("Maior valor: " + manipulaArray.encontrarMaiorValor());
        System.out.println("Menor valor: " + manipulaArray.encontrarMenorValor());
    }
}

