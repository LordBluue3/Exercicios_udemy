import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class Correcao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		String decisao;

		System.out.println("Entre com o numero da conta");
		int numero = sc.nextInt();
		System.out.println("Entre com o dono da conta");
		sc.nextLine();
		String dono = sc.nextLine();
		System.out.println("Deseja fazer um deposito inicial? (s/n)");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 's') {
			System.out.println("Entre com o valor do deposito:");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, dono, depositoInicial);
		} else {
			conta = new Conta(numero, dono);
		}


		do {
			System.out.println("");
			System.out.println("Dados da conta:");
			System.out.println(conta);
			
			System.out.println("Deseja fazer um deposito, saque ou encerrar? (deposito / saque / encerrar)");
			decisao = sc.next();

			if (decisao.equalsIgnoreCase("deposito")) {

				System.out.println("");
				System.out.print("Entre com o valor do deposito: ");
				double valorDoDeposito = sc.nextDouble();
				conta.deposito(valorDoDeposito);
				System.out.println("Dados da conta atualizado");
				System.out.println(conta);

			} else if (decisao.equalsIgnoreCase("saque")) {

				System.out.println("");
				System.out.print("Entre com o valor do saque: ");
				double valorDoSaque = sc.nextDouble();
				conta.saque(valorDoSaque);
				System.out.println("Dados da conta atualizado");
				System.out.println(conta);
			}

		} while (decisao.equalsIgnoreCase("deposito") || decisao.equalsIgnoreCase("saque"));

		sc.close();
	}

}
