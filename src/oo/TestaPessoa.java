package oo;

public class TestaPessoa {
    public static void main(String[] args) {
        // a partir da classe fulano
       Pessoa fulano = new Pessoa();
       fulano.nome = "Fulano da Silva";
       fulano.idade = 18;
       fulano.peso = 80.5;
       System.out.printf("%s tem %d anos e pesa %.2f kg!\n",
               fulano.nome, fulano.idade, fulano.peso);
       fulano.comer();
       fulano.respirar();
       fulano.dormir();

        // exericio com o proprio nome
       Pessoa william = new Pessoa();
       william.nome = "William de Castro Ricardo";
       william.idade = 21;
       william.peso = 82.5;
       System.out.printf("%s tem %d anos e pesa %.2f kg!\n",
               william.nome, william.idade, william.peso);
       william.comer();
       william.respirar();
       william.dormir();
    }
}
