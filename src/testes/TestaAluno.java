package testes;

import dominio.Aluno;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno ze = new Aluno();
        ze.nome = "Zé da Silva";
        ze.idade = 20;
        System.out.printf("%s tm %d anos\n",
                ze.nome,
                ze.idade);

    }
}
