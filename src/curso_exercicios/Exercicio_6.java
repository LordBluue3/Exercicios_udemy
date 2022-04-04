package curso_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {

		double A, B, C;
		double atriangulor, acirculo, atrapezio, aquadrado, aretangunlo;
		double pi = 3.14159;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de A:");
		A = sc.nextDouble();

		System.out.println("Digite o valor de B:");
		B = sc.nextDouble();

		System.out.println("Digite o valor de C");
		C = sc.nextDouble();

		atriangulor = (A * C) / 2;

		acirculo = Math.pow(C, 2.0) * pi;

		atrapezio = ((A + B) * C) / 2;

		aquadrado = B * B;

		aretangunlo = B * A;

		System.out.printf("Triangulo: %.3f%n", atriangulor);
		System.out.printf("Circulo: %.3f%n", acirculo);
		System.out.printf("Trapezio: %.3f%n", atrapezio);
		System.out.printf("Quadrado: %.3f%n", aquadrado);
		System.out.printf("Retangulo: %.3f%n", aretangunlo);

		sc.close();

	}

}
