package curso_exercicios;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio_a13 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double x, y;

		System.out.println("Digite a cordenada X");
		x = sc.nextDouble();

		System.out.println("Digite a cordenada Y");
		y = sc.nextDouble();

		if (x > 0 && y > 0) {

			System.out.println("Q1");

		} else if (x < 0 && y > 0) {

			System.out.println("Q2");

		} else if (x < 0 && y < 0) {

			System.out.println("Q3");

		} else if (x > 0 && y < 0) {

			System.out.println("Q4");

		} else if (x == 0 && y == 0) {
			System.out.println("Origem");
		}
	}

}
