package oo;

public class Pessoa {
    // definição de atributos
    String nome;
    int idade;
    double peso;

    public void comer() {
        System.out.printf("Sou %s e estou comendo\n", nome);
    }

    public void respirar() {
        System.out.printf("Sou %s e estou respirando\n", nome);
    }

    public void dormir() {
        System.out.printf("Sou %s e estou dormindo\n", nome);
    }
}
