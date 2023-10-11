import java.util.Scanner;

public class Atividade14 {
    /*
     * Cada espectador de um cinema respondeu a um questionário no qual constava 
     * sua idade e sua opinião em relação ao filme: ótimo — 3; bom — 2; regular — 1.
     * Faça um programa que receba a idade e a opinião de quinze espectadores, 
     * calcule e mostre:
     * ■■ a média das idades das pessoas que responderam ótimo;
     * ■■ a quantidade de pessoas que responderam regular; e
     * ■■ a percentagem de pessoas que responderam bom, entre todos os espectadores
     * analisados.
     */

     public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int idade = 0, op = 0, contaOtimo = 0, contaRegular = 0, somaIdadeOtimo = 0, contaBom = 0;
        double perIdadeBom = 0, mediaIdadeOtimo = 0;

        for (int i = 0; i < 15; i++) {
            System.out.print("\nInforme sua idade: ");
            idade = entrada.nextInt();

            if (idade < 1) {
                System.out.println("Idade inválida!");
            } else {
                System.out.print("ótimo — 3; bom — 2; regular — 1");
                System.out.print("\nQual sua opinião? ");
                op = entrada.nextInt();
                switch (op) {
                    case 3:
                        somaIdadeOtimo += idade;
                        contaOtimo++;
                        break;  
                    case 2:
                        contaBom++;
                        break;                            
                    case 1:
                        contaRegular++;
                        break;            
                    default:
                        System.out.println("Opinião inválida!");
                        break;
                }
            }


        }
        perIdadeBom = contaBom / (double)15 * 100;

        if (contaOtimo == 0) {
            System.out.println("\nNão houve opinião ótimo!");
        } else {
            mediaIdadeOtimo = somaIdadeOtimo / contaOtimo;
            System.out.println(
                "\nMédia das idades das pessoas que responderam ótimo: "
                + mediaIdadeOtimo);            
        }
        if (contaBom == 0) {
            System.out.println("Não houve opinião bom!");
        } else {
            System.out.println("Percentagem de pessoas que responderam bom: "
                +perIdadeBom + "%");
        }

        System.out.println("Quantidade de pessoas que responderam regular: "
            + contaRegular);

        entrada.close();
     }
}
