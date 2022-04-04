package curso_exercicios;

import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {

		int x;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero");
		x = sc.nextInt();

		if (x / 2 == 0) {
			System.out.println("Esse numero é par");
		} else {
			System.out.println("Esse numero é impar");
		}

	}

}
