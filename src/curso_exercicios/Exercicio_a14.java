package curso_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_a14 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario;
		double total;
		double imposto;
		double adicional;
		double adicional2;

		System.out.println("Digite seu salário: ");
		salario = sc.nextDouble();

		if (salario >= 0 && salario <= 2000.00) {
			System.out.println("Insento");
		} else if (salario >= 2000.01 && salario <= 3000.00) {

			total = salario - 2000;
			imposto = total * 0.08;
			System.out.printf("Seu imposto a pagar é: %.2f%n", imposto);

		} else if (salario >= 3000.01 && salario <= 4500.00) {

			adicional = 1000 * 0.08;

			total = salario - 3000;
			imposto = (total * 0.18) + adicional;
			System.out.printf("Seu imposto a pagar é: %.2f%n", imposto);

		} else if (salario >= 4500.00) {

			adicional = 1000 * 0.08;
			adicional2 = 1500 * 0.18;

			total = salario - 4500;
			imposto = (total * 0.28) + adicional + adicional2;
			System.out.printf("Seu imposto a pagar é: %.2f%n", imposto);
		}
	}
}