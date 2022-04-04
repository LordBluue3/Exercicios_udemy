package curso_java;

import java.util.Scanner;

public class Elevado {

	public static void main(String[] args) {
	
		
		double x,y;
		double A;
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor no qual deseja saber a elevação");
		x = sc.nextInt();
		
		System.out.println("Digite o numero da elevação");
		y = sc.nextInt();
		
		A =  Math.pow(x, y);
		
		
		System.out.println( x+" Elevado a " +y+ " é "+A);
		
		

	}

}
