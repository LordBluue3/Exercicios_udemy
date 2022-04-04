package curso_exercicios;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {

		int A, B, C, D;
		int diferenca;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor A:");
		A = sc.nextInt();

		System.out.println("Digite o valor B:");
		B = sc.nextInt();

		System.out.println("Digite o valor C:");
		C = sc.nextInt();

		System.out.println("Digite o valor D:");
		D = sc.nextInt();

		diferenca = (A * B - C * D);

		System.out.println("A diferença é: " + diferenca);

		sc.close();

	}

}
