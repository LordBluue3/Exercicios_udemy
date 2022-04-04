import java.util.Locale;
import java.util.Scanner;

import entidades.Banco;

public class Programa_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Banco dono = new Banco();

		System.out.println("Entre com o numero da conta: ");
		int numeroDaConta = sc.nextInt();
		dono.setNumeroDaConta(numeroDaConta);
		
		System.out.println("Entre com o nome do dono da conta: ");
		dono.nome = sc.next();
		
		System.out.println("Esse é o deposito inicial(s/n): ");
		dono.inicialDeposito = sc.next().charAt(0);
		
		System.out.println(dono.depositoInicial());
		System.out.println(dono.mostrar());
//		System.out.println(dono.depositar());
		System.out.println(dono.sacar());
		
		sc.close();

	}
}
