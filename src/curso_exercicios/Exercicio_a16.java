package curso_exercicios;

import java.util.Scanner;

public class Exercicio_a16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;

		System.out.println("Digite o valor de x");
		x = sc.nextInt();

		System.out.println("Digite o valor de y");
		y = sc.nextInt();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {

				System.out.println("Q1");

			} else if (x < 0 && y > 0) {

				System.out.println("Q2");

			} else if (x < 0 && y < 0) {

				System.out.println("Q3");

			} else if (x > 0 && y < 0) {

				System.out.println("Q4");
			}

			System.out.println("Digite o valor de x");
			x = sc.nextInt();

			System.out.println("Digite o valor de y");
			y = sc.nextInt();

		}

		sc.close();

	}

}
