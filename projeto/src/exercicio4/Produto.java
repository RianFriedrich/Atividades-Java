package exercicio4;

public class Produto {
	public double calcularPrecoFinal(double preco1, double preco2) {
		return preco1 + preco2;
	}
	
	public double calcularPrecoFinal(double preco1, double preco2, double desconto) {
		return preco1 + preco2 / desconto;
	}

}
