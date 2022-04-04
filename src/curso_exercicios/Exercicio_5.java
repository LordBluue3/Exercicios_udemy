package curso_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {

		int codigopeca, codigopeca2;
		int numeropecas, numeropecas2;
		double valorunidade, valorunidade2;

		double valorpeca1, valorpeca2;
		double total;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código da peça: ");
		codigopeca = sc.nextInt();

		System.out.println("Digite o número de peças: ");
		numeropecas = sc.nextInt();

		System.out.println("Digite o valor da unidade: ");
		valorunidade = sc.nextDouble();

		valorpeca1 = numeropecas * valorunidade;

		System.out.println("Digite o código da segunda peça: ");
		codigopeca2 = sc.nextInt();

		System.out.println("Digite o número de segunda peças: ");
		numeropecas2 = sc.nextInt();

		System.out.println("Digite o valor da segunda unidade: ");
		valorunidade2 = sc.nextDouble();

		valorpeca2 = numeropecas2 * valorunidade2;

		total = valorpeca2 + valorpeca1;

		System.out.printf("VALOR A PAGAR: R$ %.2f%n ", total);

		sc.close();

	}

}
