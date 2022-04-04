import java.util.Locale;
import java.util.Scanner;

import entidades.Converter;

public class Programa_6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner (System.in);
		Converter dinheiro = new Converter();
		
		System.out.println("Qual o preço do dolar?");
		dinheiro.dolar = sc.nextDouble();
		System.out.println("Quantos dolares você vai comprar?");
		dinheiro.comprar = sc.nextDouble();
		
		System.out.printf("Você pagara em reais %.2f%n", dinheiro.conversor());
		sc.close();

	}

}
