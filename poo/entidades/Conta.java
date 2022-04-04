package entidades;

public class Conta {

	private int numeroDaConta;
	private String dono;
	private double saldo;

	public Conta(int numeroDaConta, String dono) {
		this.numeroDaConta = numeroDaConta;
		this.dono = dono;
	}

	public Conta(int numeroDaConta, String dono, double depositoInicial) {
		this.numeroDaConta = numeroDaConta;
		this.dono = dono;
		deposito(depositoInicial);
	}

	@SuppressWarnings("unused")
	private int getNumeroDaConta() {
		return numeroDaConta;
	}

	@SuppressWarnings("unused")
	private String getDono() {
		return dono;
	}

	@SuppressWarnings("unused")
	private void setDono(String dono) {
		this.dono = dono;
	}

	@SuppressWarnings("unused")
	private double getSaldo() {
		return saldo;
	}

	public void deposito(double quantia) {

		saldo += quantia;
	}
	
	public void saque(double quantia) {
		saldo -= (quantia + 5);
	}
	
	public String toString() {

		return "Conta " + numeroDaConta + ", Dono " + dono + ", Dinheiro: " + saldo;
	}

}
