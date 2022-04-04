import java.util.Scanner;

import entidades.Calculos;

public class Programa_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int operacao;
		Calculos x;
		x = new Calculos();
		int resultado = -0;

		System.out.println("Digite o primeiro número:");
		x.numero1 = sc.nextInt();

		System.out.println("Digite o segundo número:");
		x.numero2 = sc.nextInt();

		System.out.println("Qual operação você deseja fazer?");
		System.out.println();

		do {
			System.out.println("1 = soma; 2 = subtração; 3 = divisão; 4 = multiplicação;");

			operacao = sc.nextInt();

			switch (operacao) {
			case 1:
				resultado = x.soma();
				break;
			case 2:
				resultado = x.menos();
				break;
			case 3:
				resultado = x.div();
				break;
			case 4:
				resultado = x.multi();
				break;
			default:
				System.out.println("Valor invalido");
				break;

			}
		} while (operacao > 4 || operacao < 0);

		if (resultado != -0) {
			System.out.println("Resultado = " + resultado);
		}
		sc.close();
	}

}
