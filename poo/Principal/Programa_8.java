import java.util.Scanner;

import entidades.Imc;

public class Programa_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    Imc valor = new Imc();
	    
		System.out.println("Digiteo o peso: ");
		valor.peso = sc.nextDouble();
		System.out.println("Digite a altura: ");
		valor.altura = sc.nextDouble();
		
		System.out.printf("O seu IMC é: %.2f%n", valor.calcularImc());
		
		sc.close();

	}

}
