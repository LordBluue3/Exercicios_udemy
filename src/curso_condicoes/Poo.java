package curso_condicoes;

import java.util.Scanner;


import entites.Triangulo;

public class Poo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Digite o valor dos 3 lados do triangulo: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite o valor dos 3 lados do triangulo: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		Double areaX = x.area();
		Double areaY = y.area();
		
		System.out.println("Area do Triangulo Y:" + areaX);
		System.out.println("Area do Triangulo Y:" + areaY);
		
		
		
		}
	


}
