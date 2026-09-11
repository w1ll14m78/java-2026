package basico;

import java.util.Scanner;

public class Decisao {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.println("Digite uma nota de 0 a 10: ");
       int nota = entrada.nextInt();

       if (nota >= 7) {
           System.out.println("passou direto!");
       } else if (nota >= 4 && nota < 7) {
           System.out.println("pegou exame!");
       } else {
           System.out.println("reprovou!");
       }

   }
}
