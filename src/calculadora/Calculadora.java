package calculadora;

public class Calculadora {
    double n1, n2;
    double resultado;

    public double somar() {
        resultado = n1 + n2;
        return resultado;

    }
/// nova versão da soma
    public double somar(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
        this.somar();
        return resultado;
    }

    public double subtrair() {
        resultado = n1 - n2;
        return resultado;

    }
/// nova versão da subtração
    public double subtrair(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
        this.subtrair();
        return resultado;
    }


    public double multiplicar() {
        resultado = n1 * n2;
        return resultado;

    }
/// nova versão da multiplicação
    public double multiplicar(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
        this.multiplicar();
        return resultado;
    }

    public double dividir() {
        resultado = n1 / n2;
        return resultado;

    }
/// nova versão da divisão
    public double dividir(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
        this.dividir();
        return resultado;
    }

    public double MostrarUltimoResultadoCalculado() {
        System.out.println("Resultado atual é " + resultado);
        return resultado;
    }
}
