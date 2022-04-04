package curso_condicoes;

import java.util.Scanner;

public class Case {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		String dia;

		System.out.println("Digite um numero");
		x = sc.nextInt();

		switch (x) {
		case 1:
			dia = "domingo";
			break;

		case 2:
			dia = "segunda";
			break;

		case 3:
			dia = "terça";
			break;

		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;

		case 6:
			dia = "sexta";
			break;

		case 7:
			dia = "domingo";

			System.out.println("Hoje é " + dia);
		default:
			dia = "valor invalido";
			break;

		}
		System.out.println("Hoje é " + dia);

		sc.close();

	}

}
