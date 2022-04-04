package curso_exercicios;

import java.util.Scanner;

public class Exercicio_a12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;

		System.out.println("Digite um numero");
		numero = sc.nextInt();

		if (numero <= 25 && numero >= 0) {

			System.out.println("Intervalo [0,25]");

		} else if (numero <= 50 && numero > 25) {

			System.out.println("Intervalo [25,50]");

		} else if (numero <= 75 && numero > 50) {

			System.out.println("Intervalo [50,75]");

		} else if (numero <= 100 && numero > 75) {

			System.out.println("Intervalo [75,100]");

		} else {
			System.out.println("Intervalo inválido");
		}

	}

}
