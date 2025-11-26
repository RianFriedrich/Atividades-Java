package exercicio3;

public class Casa implements ICasa {
	public int calcularPreco(int quarto1, int quarto2) {
		return quarto1 + quarto2;
	}
    
	public int calcularPreco(int quarto1, int quarto2, int quarto3) {
		return quarto1 + quarto2 + quarto3;
	}
    
	public int calcularPreco(int quarto1, int quarto2, int quarto3, int quarto4) {
		return quarto1 + quarto2 + quarto3 + quarto4;
	}
}
