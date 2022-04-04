import java.util.Scanner;

import entidades.Onibus;

public class Programa_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Onibus cartao;
		cartao = new Onibus();
		
		System.out.println("Valor que tem no cartão");
		cartao.cartao = sc.nextDouble();
		
		System.out.println(cartao.validar());
		
		sc.close();

	}

}
