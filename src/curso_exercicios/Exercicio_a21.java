package curso_exercicios;

import java.util.Scanner;

public class Exercicio_a21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;

		System.out.println("Digite um numero");
		numero = sc.nextInt();

		for (int i = 1; i <= numero; i++) {

			if (numero % i == 0) {

				System.out.println(i);

			} 
		}
	}

}
