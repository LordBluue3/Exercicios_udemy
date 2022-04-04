package curso_java;

import java.util.Scanner;

public class calculos {
	
	public static void main (String []args) {
		
		int valor1, valor2, valor3;
		int resultado;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		valor2 = sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		valor3 = sc.nextInt();
		
		resultado = (valor1 * valor2) / valor3;
		
		System.out.println("A regrade de três dessa equação é: " +resultado);
		
		
		
		
	}

}
