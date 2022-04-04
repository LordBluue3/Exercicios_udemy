package curso_condicoes;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("Digitei um numero");
		n = sc.nextInt();

		if (n == 2 || n == 3 || n == 5) {

			System.out.println(n + " é primo");

		} else if (n % 2 != 0 && n % 3 != 0 && n % 5 != 0) {

			System.out.println(n + " é primo");

		} else {
			System.out.println(n + " não é primo");
		}
	}

}
