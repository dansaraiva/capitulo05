import java.util.Scanner;
/**
 * Faça um programa que receba dez números inteiros e mostre a quantidade de
 * números primos dentre os números que foram digitados.
 */
public class Atividade12 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int num = 0,  totalPrimos = 0;
        boolean primo = true;

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe um número inteiro: ");
            num = entrada.nextInt();
            if (num < 2) {
                primo = false;
            }
            for (int j = 2; j <= Math.sqrt(num)+1;j++) {
                if (num % j == 0) {
                    primo = false;
                }
            }
            if (primo || num == 2)  {
                totalPrimos++;
            }
            primo = true;
        }

        System.out.println("O total de números primos digitados é: "+totalPrimos);
        entrada.close();
    }
}
