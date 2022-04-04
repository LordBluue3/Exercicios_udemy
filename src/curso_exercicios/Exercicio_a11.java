package curso_exercicios;

import java.util.Scanner;

public class Exercicio_a11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int codigo;
		double preco = 0;
		String nome = "invalido";
		int quantia;
		double total;
		int invalido = 1;

		System.out.println("Digite o código do produto");
		codigo = sc.nextInt();

		System.out.println("Digite a quantia do produto");
		quantia = sc.nextInt();

		switch (codigo) {
		case 1:
			nome = "Cachorro Quente";
			preco = 4.00;
			break;
		case 2:
			nome = "X-Salada";
			preco = 4.50;
			break;
		case 3:
			nome = "X-Bacon";
			preco = 5.00;
			break;
		case 4:
			nome = "Torrada Simples";
			preco = 2.00;
			break;
		case 5:
			nome = "Refrigerante";
			preco = 1.50;
			break;
		default:
			invalido = 2;
			break;
		}
		if (invalido == 1) {
			total = preco * quantia;
			System.out.println("Quantia " + quantia + "x " + " Produto " + nome + " TOTAL = " + total);
		} else {

			System.out.println("Produto Inválido");

		}

	}

}
