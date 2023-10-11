import java.util.Scanner;

public class Atividade13 {
    /*
     * Faça um programa que receba a idade e o peso de quinze pessoas, e que
     * calcule e mostre as médias dos pesos das pessoas da mesma faixa etária.
     * As faixas etárias são: de 1 a 10 anos, de 11 a 20 anos, de 21 a 30 anos 
     * e de 31 anos para cima.
     */
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int idade = 0, faixa1 = 0, faixa2 = 0, faixa3 = 0, faixa4 = 0;
        double peso = 0, somaPesoFaixa1 = 0, somaPesoFaixa2 = 0;
        double somaPesoFaixa3 = 0, somaPesoFaixa4 = 0;
        double mediaPesoFaixa1 = 0, mediaPesoFaixa2 = 0, mediaPesoFaixa3 = 0;
        double mediaPesoFaixa4 = 0;

        for (int i = 0; i < 15; i++) {
            System.out.print("Informe idade: ");
            idade = entrada.nextInt();
            System.out.print("Informe peso: ");
            peso = entrada.nextDouble();

            if (idade >= 1 && idade <= 10){
                somaPesoFaixa1 += peso;
                faixa1++;
            }else if (idade >= 11 && idade <= 20){
                somaPesoFaixa2 += peso;
                faixa2++;
            }else if (idade >= 21 && idade <= 30){
                somaPesoFaixa3 += peso;
                faixa3++;
            }else if (idade >= 31){
                somaPesoFaixa4 += peso;
                faixa4++;
            }else{
                System.out.println("Idade inválida!");
            }
        }
        mediaPesoFaixa1 = somaPesoFaixa1 / faixa1;
        mediaPesoFaixa2 = somaPesoFaixa2 / faixa2;
        mediaPesoFaixa3 = somaPesoFaixa3 / faixa3;
        mediaPesoFaixa4 = somaPesoFaixa4 / faixa4;

        System.out.println("Média dos pesos das pessoas da faixa etária 01: "+ mediaPesoFaixa1);
        System.out.println("Média dos pesos das pessoas da faixa etária 02: "+ mediaPesoFaixa2);
        System.out.println("Média dos pesos das pessoas da faixa etária 03: "+ mediaPesoFaixa3);
        System.out.println("Média dos pesos das pessoas da faixa etária 04: "+ mediaPesoFaixa4);
        
        entrada.close();
     }
}
