package entidades;

public class Aluno {

	public int nota1;
	public int nota2;
	public int nota3;

	public String passou() {

		String resultado;
		int notaFinal = nota1 + nota2 + nota3;

		if (notaFinal > 60) {
			System.out.println("Nota Final: " + notaFinal);
			resultado = "Passou";
		} else {
			System.out.println("Nota Final: " + notaFinal);
			System.out.println("Não passou");
			System.out.println("Flataram: " + (60 - notaFinal) + " Para passar");
			resultado = "";
		}

		return resultado;
	}

}
