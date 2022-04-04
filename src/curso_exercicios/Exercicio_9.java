package curso_exercicios;

import java.util.Scanner;

public class Exercicio_9 {

	public static void main(String[] args) {

		int x, z;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero");
		x = sc.nextInt();

		System.out.println("Digite outro numero");
		z = sc.nextInt();

		if (x % z == 0 || z % x == 0) {

			System.out.println("Esse numero é multiplo");

		} else {

			System.out.println("Esse numero não é multiplo");

		}

	}

}
