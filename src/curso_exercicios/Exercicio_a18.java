package curso_exercicios;

import java.util.Scanner;

public class Exercicio_a18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;

		System.out.println("Digite um numero");
		x = sc.nextInt();

		for (int i = 0; x > 0 && x <= 1000 && i <= x; i++) {

			if (i % 2 != 0) {

				System.out.println(i);

			} else {

			}

		}

	}

}
