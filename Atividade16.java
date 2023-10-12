import java.util.Scanner;

public class Atividade16 {
   /*
    * Faça um programa que receba várias idades, calcule e mostre a média das
    * idades digitadas. Finalize digitando idade igual a zero.
    */

   public static void main(String[] args) {
      var entrada = new Scanner(System.in);
      int idade = 0, contador = 0, somaIdade = 0;
      double mediaIdade = 0;

      do {
         System.out.print("Informe idade: ");
         idade = entrada.nextInt();

         somaIdade += idade;
         if (idade != 0) {
            contador++;
         }

      } while (idade != 0);

      mediaIdade = somaIdade / contador;
      System.out.println("Média das idades digitadas: " + mediaIdade);

      entrada.close();
   }
}
