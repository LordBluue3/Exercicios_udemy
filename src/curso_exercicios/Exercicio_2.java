package curso_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {

		double raio;
		double pi = 3.14159;
		double area;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do raio: ");
		raio = sc.nextDouble();

		area = pi * Math.pow(raio, 2.0);

		System.out.printf("A area do circulo é: %.4f%n ", area);

	}

}
