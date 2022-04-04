package entidades;

public class Funcionario {

	public String nome;
	public double salarioBruto, imposto, porcentagem;

	public double salarioLiquido() {

		double salarioLiquido = salarioBruto - imposto;
		return salarioLiquido;

	}

	public double incremento() {

		double porCem = porcentagem * salarioBruto / 100;
		double novoBruto = porCem + salarioBruto;
		double novoValor = novoBruto - imposto;
		return novoValor;

	}
}
