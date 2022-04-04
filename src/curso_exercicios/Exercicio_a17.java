package curso_exercicios;

import java.util.Scanner;

public class Exercicio_a17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int gasolina = 0, alcool = 0, diesel = 0;
		String fim = "Muito Obrigado";
		int numero;

		System.out.println("Digite o numero do produto");
		numero = sc.nextInt();

		while (numero != 4) {

			switch (numero) {
			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				diesel += 1;
				break;
			}

			System.out.println("Digite o numero do produto");
			numero = sc.nextInt();

		}

		System.out.println(fim);
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

	}

}
