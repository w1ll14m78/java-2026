package basico;

import java.util.Scanner;

public class Decisao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Digite uma nota de 0 a 10 [-1 para finalizar]: ");
            nota = entrada.nextInt();
            //se nota for < -1 ou se nota for >10
            if (nota < -1 || nota > 10) {
                System.out.println("valor invalido! tente novamente!");
                continue;
            }

            if (nota == -1) {
                System.out.println("encerramento do sistema!");
                break;
            }

            //-1 é o valor que encerra o programa
            if (nota >= 7) {
                System.out.println("passou direto!");
            } else if (nota >= 4 && nota < 7) {
                System.out.println("pegou exame!");
            } else {
                System.out.println("reprovou!");
            }
        } while (nota != -1);

        entrada.close(); // Boa prática: fecha o Scanner
    }
}