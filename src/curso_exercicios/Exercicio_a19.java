package curso_exercicios;

import java.util.Scanner;

public class Exercicio_a19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, n = 0, n2 = 0, y;

		System.out.println("Digite um numero");
		x = sc.nextInt();
		System.out.println("================");

		for (int i = 1; i <= x; i++) {

			System.out.println("Digite um numero");
			y = sc.nextInt();

			if (y >= 10 && y <= 20) {
				n++;
			} else {
				n2++;
			}
		}

		System.out.println(n + " In");
		System.out.println(n2 + " Out");
		
	}

}
