package curso_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {

		int numero;
		int horas;
		double salariohoras;
		double salariobruto;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu nmero: ");
		numero = sc.nextInt();

		System.out.println("Digite o seu número de horas trabalhadas: ");
		horas = sc.nextInt();

		System.out.println("Digite seu salário por hora trabalhada: ");
		salariohoras = sc.nextDouble();

		salariobruto = horas * salariohoras;

		System.out.println("Número " + numero);
		System.out.printf("Seu salário é: %.2f%n", salariobruto);

	}

}
