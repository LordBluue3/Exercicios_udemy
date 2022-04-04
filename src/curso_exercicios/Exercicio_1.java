package curso_exercicios;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {

		int a, b, c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor:");
		a = sc.nextInt();

		System.out.println("Digite o segundo valor:");
		b = sc.nextInt();

		c = a + b;

		System.out.println("Soma = " + c);

		sc.close();

	}

}
