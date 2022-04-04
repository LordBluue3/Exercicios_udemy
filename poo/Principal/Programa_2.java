import java.util.Scanner;

import entidades.Retangulo;

public class Programa_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Retangulo a;
		a = new Retangulo();

		System.out.println("Digite a altura: ");
		a.h = sc.nextInt();
		System.out.println("Digite a largura: ");
		a.b = sc.nextInt();

		int area = a.area();
		int perimetro = a.perimetro();
		int diagonal = a.diagonal();

		System.out.println("Area = " + area);
		System.out.println("Perimetro = " + perimetro);
		System.out.println("Diagonal = " + diagonal);

		sc.close();
	}

}
