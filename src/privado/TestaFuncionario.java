package privado;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario fulano = new Funcionario(
                "fulano da silva",
                25,
                1234.00
    );

        fulano.setIdade(20);
        fulano.setSalario(1800.00);

        System.out.println("nome: " + fulano.getNome());
        System.out.println("idade: " + fulano.getIdade());
        System.out.println("salario: " + fulano.getSalario());
    }
}
