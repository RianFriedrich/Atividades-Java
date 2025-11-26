package app;

public class MainRunner {

    public static void main(String[] args) {
        System.out.println("=== Executando exercícios ===");

        System.out.println("\n-- Exercício 1 --");
        exercicio1.Triangulo t = new exercicio1.Triangulo();
        System.out.println("Área do triângulo (8.8,9.9): " + t.calcularArea(8.8, 9.9));
        exercicio1.FormaGeometrica f = new exercicio1.FormaGeometrica();
        System.out.println("Área da forma (9,10): " + f.calcularArea(9, 10));

        System.out.println("\n-- Exercício 2 --");
        exercicio2.Geerente g = new exercicio2.Geerente();
        System.out.println("Salário do gerente: " + g.calcularSalario(7.1, 8, 9));

        System.out.println("\n-- Exercício 3 --");
        exercicio3.Casa c = new exercicio3.Casa();
        System.out.println("Preço da casa (5,7): " + c.calcularPreco(5, 7));

        System.out.println("\n-- Exercício 4 --");
        exercicio4.Produto p = new exercicio4.Produto();
        System.out.println("Preço final do produto (10,10): " + p.calcularPrecoFinal(10, 10));

        System.out.println("\n=== Fim ===");
    }

}
