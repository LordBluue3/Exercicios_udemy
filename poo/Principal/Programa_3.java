import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class Programa_3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario variavel;
		Funcionario nome;
		nome = new Funcionario();
		variavel = new Funcionario();

		System.out.println("Digite o nome do funcionario: ");
		nome.nome = sc.nextLine();

		System.out.println("Digite o salário bruto: ");
		variavel.salarioBruto = sc.nextDouble();

		System.out.println("Digite o imposto: ");
		variavel.imposto = sc.nextDouble();

		double salarioLiquido = variavel.salarioLiquido();

		System.out.println();
		System.out.printf("Funcionário: " + nome.nome + ", %.2f%n ", salarioLiquido);
		System.out.println();

		System.out.println("Qual a porcentagem que deseja aumentar o salário?: ");
		variavel.porcentagem = sc.nextDouble();

		double novoSalario = variavel.incremento();
		System.out.printf("Novo salário: %.2f%n ", novoSalario);
    	sc.close();

	}

}
