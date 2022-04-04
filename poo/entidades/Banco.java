package entidades;

import java.util.Scanner;

public class Banco {

	public String nome;
	public char inicialDeposito;
	public String pergunta;
	private int numeroDaConta;
	private double valorDaConta;
	

	public String depositoInicial() {
		Scanner scan = new Scanner(System.in);
		String frase = "Numero errado";
		if (inicialDeposito == 's') {
			frase = "";
			System.out.println("Entre com o deposito inicial: ");
			double deposito = scan.nextDouble();
			setValorDaConta(deposito);
			scan.close();
		} else if (inicialDeposito == 'n') {
			frase = "";

		}
		return frase;

	}

//	public String depositar() {
//		Scanner x = new Scanner(System.in);
//		 String frase = "";
//		System.out.println("Entre com o valor do deposito");
//		setValorDaConta(valorDaConta + depositoInicial);
//		x.close();
//		return frase;
//	}
	
	public String sacar() {
		Scanner x = new Scanner(System.in);
		 String frase = "";
		System.out.println("Entre com o valor do saque");
		double saque = x.nextDouble();
		setValorDaConta((valorDaConta - saque)- 5);
		x.close();
		return frase;
	}

	public String mostrar() {

		return "Conta " + numeroDaConta + ", Dono " + nome + ", Dinheiro: " + valorDaConta;
	}

	public double getValorDaConta() {
		return valorDaConta;
	}

	public void setValorDaConta(double valorDaConta) {
		this.valorDaConta = valorDaConta;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

}
