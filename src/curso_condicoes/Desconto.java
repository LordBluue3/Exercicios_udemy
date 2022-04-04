package curso_condicoes;

import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;

		System.out.println("Digite um numero");
		n = sc.nextInt();

		double desconto = (n < 20) ? n * 0.01 : n * 0.05;

		System.out.println(desconto);
	}

}
