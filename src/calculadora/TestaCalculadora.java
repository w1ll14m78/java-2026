package calculadora;

import javax.swing.*;

public class TestaCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.n1 = 40;
        calc.n2 = 2;

        System.out.println(calc.n1);
        System.out.println(calc.n2);

        System.out.println("soma = " + calc.somar());
        System.out.println("subtração = " + calc.subtrair());
        System.out.println("produto = " + calc.multiplicar());
        System.out.println("coficiente = " + calc.dividir());;

        System.out.println("soma = " + calc.somar(50, 100));
        System.out.println("subtração = " + calc.subtrair(75, 50));
        System.out.println("produto = " + calc.multiplicar(2, 10));
        System.out.println("coficiente = " + calc.dividir(100, 2));

        JOptionPane.showMessageDialog(null,calc.MostrarUltimoResultadoCalculado());
    }
}
