package exercicio1;

public class FormaGeometrica implements IFormaGeometrica {
	public int calcularArea(int base, int altura) {
		return base * altura;
	}

	@Override
	public double calcularArea(double base, double altura) {
		return base * altura;
	}

}
