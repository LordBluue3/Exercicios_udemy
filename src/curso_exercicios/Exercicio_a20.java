package curso_exercicios;

import java.util.Scanner;

public class Exercicio_a20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;
		double numero1, numero2, numero3;
		double media;

		System.out.println("Digite um numero");
		numero = sc.nextInt();

		for (int i = 0; i < numero; i++) {

			numero1 = sc.nextDouble();
			numero2 = sc.nextDouble();
			numero3 = sc.nextDouble();

			media = ((numero1 * 1) + (numero2 * 2) + (numero3 * 3)) / 6;
			System.out.printf("%.1f%n", media);
		}

	}

}
