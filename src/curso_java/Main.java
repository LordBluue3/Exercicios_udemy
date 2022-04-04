package curso_java;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String produto1 = "Computer";
		String produto2 = "Office desk";
		
		int idade = 30;
		int code = 5290;
		char gender = 'F';
		
		double price = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		
		
		System.out.printf(produto1+ " wich price is $ %.1f%n", price);
		System.out.printf(produto2+" wich price is $ %.2f%n", price2);
		System.out.println();
		
		System.out.println("Record: "+ idade + " years old, code "+ code +" and gender: "+ gender);
		
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.9f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n ", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n" , measure);

	}

}
