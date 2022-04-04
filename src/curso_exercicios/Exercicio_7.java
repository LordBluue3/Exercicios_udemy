package curso_exercicios;

import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {

		int x;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero:");
		x = sc.nextInt();

		if (x < 0) {
			System.out.println("Esse numero é negativo");
		} else {
			System.out.println("Esse numero é positivo");
		}

	}

}
