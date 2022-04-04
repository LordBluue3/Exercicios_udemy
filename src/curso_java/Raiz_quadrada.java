package curso_java;

import java.util.Scanner;

public class Raiz_quadrada {

	public static void main(String[] args) {
		
		
		int x, y, z;
		int A, B, C;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor no qual deseja obter a raiz quadrada");
		x = sc.nextInt();
		
		System.out.println("Digite o segundo valor no qual deseja obter a raiz quadrada");
		y = sc.nextInt();
		
		System.out.println("Digite o terceiro valor no qual deseja obter a raiz quadrada");
		z = sc.nextInt();
		
		
		
		A= (int) Math.sqrt(x);
		B = (int) Math.sqrt(y);
		C = (int) Math.sqrt(z);
		
		System.out.println("A raiz quadrada de: " + x +" é: "+A);
		System.out.println("A raiz quadrada de: " + y +" é: "+B);
		System.out.println("A raiz quadrada de: " + z +" é: "+C);
		
		
		
		
		
		
		
		

	}

}
