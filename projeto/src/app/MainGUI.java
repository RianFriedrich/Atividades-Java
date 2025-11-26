package app;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Atividades Java - Menu Interativo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Exercícios");

        JMenuItem ex1 = new JMenuItem("Exercício 1 - Triângulo");
        ex1.addActionListener(e -> runExercicio1());
        menu.add(ex1);

        JMenuItem ex2 = new JMenuItem("Exercício 2 - Funcionário/Gerente");
        ex2.addActionListener(e -> runExercicio2());
        menu.add(ex2);

        JMenuItem ex3 = new JMenuItem("Exercício 3 - Casa");
        ex3.addActionListener(e -> runExercicio3());
        menu.add(ex3);

        JMenuItem ex4 = new JMenuItem("Exercício 4 - Produto");
        ex4.addActionListener(e -> runExercicio4());
        menu.add(ex4);

        menu.addSeparator();

        JMenuItem runAll = new JMenuItem("Executar todos");
        runAll.addActionListener(e -> {
            runExercicio1();
            runExercicio2();
            runExercicio3();
            runExercicio4();
        });
        menu.add(runAll);

        menu.addSeparator();
        JMenuItem sair = new JMenuItem("Sair");
        sair.addActionListener(e -> System.exit(0));
        menu.add(sair);

        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        JLabel label = new JLabel("Use o menu 'Exercícios' para rodar cada item.");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(label);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static Double parseDoubleInput(String message) {
        while (true) {
            String input = JOptionPane.showInputDialog(null, message);
            if (input == null) return null; // canceled
            try {
                return Double.parseDouble(input.replace(',', '.'));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static Integer parseIntegerInput(String message) {
        while (true) {
            String input = JOptionPane.showInputDialog(null, message);
            if (input == null) return null;
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um inteiro.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static void runExercicio1() {
        Double base = parseDoubleInput("Informe a base do triângulo:");
        if (base == null) return;
        Double altura = parseDoubleInput("Informe a altura do triângulo:");
        if (altura == null) return;
        exercicio1.Triangulo t = new exercicio1.Triangulo();
        double area = t.calcularArea(base, altura);
        JOptionPane.showMessageDialog(null, "Área do triângulo: " + area);
    }

    private static void runExercicio2() {
        int opc = JOptionPane.showConfirmDialog(null, "Executar como Gerente? (Sim = Gerente; Não = Funcionário)", "Escolha", JOptionPane.YES_NO_CANCEL_OPTION);
        if (opc == JOptionPane.CANCEL_OPTION || opc == JOptionPane.CLOSED_OPTION) return;
        if (opc == JOptionPane.YES_OPTION) {
            Double s1 = parseDoubleInput("Salário 1:"); if (s1 == null) return;
            Double s2 = parseDoubleInput("Salário 2:"); if (s2 == null) return;
            Double bonus = parseDoubleInput("Bônus:"); if (bonus == null) return;
            exercicio2.Geerente g = new exercicio2.Geerente();
            double sal = g.calcularSalario(s1, s2, bonus);
            JOptionPane.showMessageDialog(null, "Salário do gerente: " + sal);
        } else {
            Double s1 = parseDoubleInput("Salário 1:"); if (s1 == null) return;
            Double s2 = parseDoubleInput("Salário 2:"); if (s2 == null) return;
            exercicio2.Funcionario f = new exercicio2.Funcionario();
            double sal = f.calcularSalario(s1, s2);
            JOptionPane.showMessageDialog(null, "Salário do funcionário: " + sal);
        }
    }

    private static void runExercicio3() {
        Integer quartos = parseIntegerInput("Quantos quartos para somar? (2-4)");
        if (quartos == null) return;
        if (quartos < 2 || quartos > 4) {
            JOptionPane.showMessageDialog(null, "Informe entre 2 e 4 quartos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        exercicio3.Casa c = new exercicio3.Casa();
        int preco = 0;
        if (quartos == 2) {
            Integer q1 = parseIntegerInput("Valor quarto 1:"); if (q1 == null) return;
            Integer q2 = parseIntegerInput("Valor quarto 2:"); if (q2 == null) return;
            preco = c.calcularPreco(q1, q2);
        } else if (quartos == 3) {
            Integer q1 = parseIntegerInput("Valor quarto 1:"); if (q1 == null) return;
            Integer q2 = parseIntegerInput("Valor quarto 2:"); if (q2 == null) return;
            Integer q3 = parseIntegerInput("Valor quarto 3:"); if (q3 == null) return;
            preco = c.calcularPreco(q1, q2, q3);
        } else {
            Integer q1 = parseIntegerInput("Valor quarto 1:"); if (q1 == null) return;
            Integer q2 = parseIntegerInput("Valor quarto 2:"); if (q2 == null) return;
            Integer q3 = parseIntegerInput("Valor quarto 3:"); if (q3 == null) return;
            Integer q4 = parseIntegerInput("Valor quarto 4:"); if (q4 == null) return;
            preco = c.calcularPreco(q1, q2, q3, q4);
        }
        JOptionPane.showMessageDialog(null, "Preço total da casa: " + preco);
    }

    private static void runExercicio4() {
        Double p1 = parseDoubleInput("Preço 1:"); if (p1 == null) return;
        Double p2 = parseDoubleInput("Preço 2:"); if (p2 == null) return;
        int hasDiscount = JOptionPane.showConfirmDialog(null, "Deseja aplicar desconto?", "Desconto", JOptionPane.YES_NO_OPTION);
        double resultado;
        exercicio4.Produto prod = new exercicio4.Produto();
        if (hasDiscount == JOptionPane.YES_OPTION) {
            Double desc = parseDoubleInput("Valor do desconto (se percentual, insira entre 0 e 1, ex: 0.1 para 10%):"); if (desc == null) return;
            int tipo = JOptionPane.showConfirmDialog(null, "O desconto informado é percentual (Sim) ou valor absoluto (Não)?", "Tipo de desconto", JOptionPane.YES_NO_OPTION);
            if (tipo == JOptionPane.YES_OPTION) {
                // percentual
                resultado = (p1 + p2) * (1 - desc);
            } else {
                // absoluto
                resultado = (p1 + p2) - desc;
            }
        } else {
            resultado = prod.calcularPrecoFinal(p1, p2);
        }
        JOptionPane.showMessageDialog(null, "Preço final do produto: " + resultado);
    }

}
