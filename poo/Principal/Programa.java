import java.util.Scanner;

import entidades.Aluno;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno a;
		a = new Aluno();

		System.out.println("Digite as três notas do aluno: ");
		a.nota1 = sc.nextInt();
		a.nota2 = sc.nextInt();
		a.nota3 = sc.nextInt();

		String sla = a.passou();

		System.out.println(sla);

		sc.close();
	}

}
