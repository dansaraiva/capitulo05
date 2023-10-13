import java.util.Scanner;

public class Atividade17 {
    /*
     * Foi feita uma pesquisa sobre a audiência de canal de TV em várias casas de
     * uma cidade, em determinado dia. Para cada casa consultada foi fornecido o
     * número do canal (4, 5, 7, 12) e o número de pessoas que estavam assistindo
     * àquele canal. Se a televisão estivesse desligada, nada era anotado, ou seja,
     * essa casa não entrava na pesquisa. Faça um programa que:
     * ■■ leia um número indeterminado de dados (número do canal e número de pessoas
     * que estavam assistindo); e
     * ■■ calcule e mostre a porcentagem de audiência de cada canal.
     * Para encerrar a entrada de dados, digite o número do canal ZERO.
     */

    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int canal = 0, numeroAudiencia = 0;
        int audCanal4 = 0, audCanal5 = 0, audCanal7 = 0, audCanal12 = 0;
        int audTotal = 0;

        do {
            System.out.print("Informe canal(4, 5, 7, 12): ");
            canal = entrada.nextInt();
            
            if (canal == 4) {
                System.out.print("Informe número de pessoas assistindo: ");
                numeroAudiencia = entrada.nextInt();
                audCanal4 += numeroAudiencia;
                audTotal += numeroAudiencia;
            } else if (canal == 5) {
                System.out.print("Informe número de pessoas assistindo: ");
                numeroAudiencia = entrada.nextInt();
                audCanal5 += numeroAudiencia;
                audTotal += numeroAudiencia;
            } else if (canal == 7) {
                System.out.print("Informe número de pessoas assistindo: ");
                numeroAudiencia = entrada.nextInt();
                audCanal7 += numeroAudiencia;
                audTotal += numeroAudiencia;
            } else if (canal == 12) {
                System.out.print("Informe número de pessoas assistindo: ");
                numeroAudiencia = entrada.nextInt();
                audCanal12 += numeroAudiencia;
                audTotal += numeroAudiencia;
            } else if (canal == 0) {
                System.out.println("Obrigado por participar!");
            } else {
                System.out.println("Canal inválido!");
            }
        } while (canal != 0);

        System.out.println("Porcentagem de audiência cancal 4: " + (audCanal4 / (double)audTotal)*100);
        System.out.println("Porcentagem de audiência cancal 5: " + (audCanal5 / (double)audTotal)*100);
        System.out.println("Porcentagem de audiência cancal 7: " + (audCanal7 / (double)audTotal)*100);
        System.out.println("Porcentagem de audiência cancal 12: " + (audCanal12 / (double)audTotal)*100);

        entrada.close();
    }
}
