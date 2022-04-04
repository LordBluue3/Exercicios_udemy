package entidades;

public class Converter {

	public double dolar, comprar;

	public double conversor() {

		double resultado = dolar * comprar;
		double resultadoporcentagem = resultado * 0.06;
		double resultadofinal = resultado + resultadoporcentagem;
		return resultadofinal;
	}

}
