package basico;

public class Basico {
    // Exemplo do for() crescente
    public static void main(String[] args) {
        System.out.println("Lista de 1 até 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //exemplo do for() decrescente
        System.out.println("\n\nLista de dez até um");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        // Versão crescente com while()
        System.out.println("\n\nLista crescente com while");
        int numero = 1; // inicialização da váriavel
        while (numero <= 10) {
            System.out.println(numero);
            numero++;
        }

        // Versão crescente com while()
        System.out.println("\n\nLista decrecente com while");
        numero = 10; // inicialização da váriavel
        while (numero >= 1) {
            System.out.println(numero);
            numero--;
        }
    }
}
