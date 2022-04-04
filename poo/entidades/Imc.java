package entidades;

public class Imc {
	public double peso, altura;
	
	public double calcularImc() {
		
		double imc = peso/ Math.pow(altura, 2.00);
		return imc;
		
	}
}
