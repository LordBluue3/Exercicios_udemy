package entidades;

public class Retangulo {

	public int b;
	public int h;

	public int area() {

		int a = b * h;
		return a;
	}

	public int perimetro() {
		int p = 2 * (b + h);
		return p;
	}

	public int diagonal() {
		int d = (int) Math.sqrt((Math.pow(b, 2) + Math.pow(h, 2)));
		return d;
	}

}
