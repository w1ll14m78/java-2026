package calculadora;

import javax.swing.*;

public class TestaCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Soma: " + calc.somar(50, 100));
        System.out.println("Subtração: " + calc.subtrair(50, 100));
        System.out.println("Produto: " + calc.multiplicar(50, 100));
        System.out.println("Quociente: " + calc.dividir(50, 100));

        do {
/// recebe os valores e elimina os valores em branco .trim()
            String numero1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
            String numero2 = JOptionPane.showInputDialog("Digite o segundo numero: ");

/// verificações de condições de erro
            if (numero1 == null || numero2 == null) {
                System.exit(0);
            } else if (numero1.trim().equals(" ") || numero2.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Erro entrada de dados, digite novamenta");

            } else {

/// conversão de string para double
                double num1 = Double.parseDouble(numero1);
                double num2 = Double.parseDouble(numero2);

/// chamando o metodo somar
                double total = calc.somar(num1, num2);

                JOptionPane.showMessageDialog(null, "Resultado = " + total);
            }
        } while (true);
    }
}
