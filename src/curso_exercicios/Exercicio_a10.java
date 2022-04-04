package curso_exercicios;

import java.util.Scanner;

public class Exercicio_a10 {

	public static void main(String[] args) {

		int horainicial;
		int horafinal;
		int duracao;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a hora do inicio da partida");
		horainicial = sc.nextInt();
		System.out.println("Digite a hora do final da partida");
		horafinal = sc.nextInt();

		if (horainicial < horafinal) {
			duracao = horafinal - horainicial;
		} else {
			duracao = 24 - horainicial + horafinal;
		}
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

	}

}
