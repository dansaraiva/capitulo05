import java.util.Scanner;

public class Atividade07 {
    /*
     * Faça um programa que receba a idade, a altura e o peso de cinco pessoas,
     * calcule e mostre:
     * ■■ a quantidade de pessoas com idade superior a 50 anos;
     * ■■ a média das alturas das pessoas com idade entre 10 e 20 anos;
     * ■■ a porcentagem de pessoas com peso inferior a 40 kg entre todas
     * as pessoas analisadas.
     */

     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //var ent = new Scanner(System.in);
        int idade = 0, idadeMaior50 = 0, qtdAlturasIdade10E20 = 0;
        double altura = 0, peso = 0, somaAlturasIdade10E20 = 0;
        double pesoMenor40 = 0, mediaAlturas = 0, perPeso = 0, somaPeso = 0;

        for(int i = 1; i <= 5;i++){
            System.out.print("Informe sua idade: ");
            idade = entrada.nextInt();
            System.out.print("Informe seu peso: ");
            peso = entrada.nextDouble();
            System.out.print("Informe sua altura: ");
            altura = entrada.nextDouble();

            if(idade > 50){
                idadeMaior50++;
                //idadeMaior50 = idadeMaior50 + 1
            }
            if((idade >= 10) && (idade <= 20)){
                qtdAlturasIdade10E20++;
                somaAlturasIdade10E20 += altura;
                //somaAlturasIdade10E20 = somaAlturasIdade10E20 + altura
            }
            if(peso < 40 ){
                pesoMenor40 += peso;                
            }
            somaPeso += peso;            
        }
        mediaAlturas = somaAlturasIdade10E20 / qtdAlturasIdade10E20;
        perPeso = (pesoMenor40 / somaPeso)*100;
        System.out.println(
            "Quantidade de pessoas com idade superior a 50 anos: "
            + idadeMaior50);
        System.out.println(
            "Média das alturas das pessoas com idade entre 10 e 20 anos: " 
            + mediaAlturas);
        System.out.println(
            "Porcentagem de pessoas com peso inferior a 40 kg: " 
            + perPeso);
        entrada.close();
     }
}
