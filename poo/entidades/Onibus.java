package entidades;

public class Onibus {

	public double cartao;
	String nada = "";

	public String validar() {

		if (cartao >= 4.40) {

			cartao = cartao - 4.40;
			System.out.println("Debitado: 4.40");
			System.out.printf("Valor no cartão: %.2f%n", cartao );

		} else {

			System.out.printf("Falha, saldo insuficiente: %.2f%n", cartao );

		}


		return nada ;

	}
}
