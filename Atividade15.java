import java.util.Scanner;

public class Atividade15 {
    /*
     * Uma empresa fez uma pesquisa de mercado para saber se as pessoas gostaram ou
     * não de um novo produto lançado. Para isso, forneceu o sexo do entrevistado e
     * sua resposta (S — sim; ou N — não). Sabe-se que foram entrevistadas dez
     * pessoas. Faça um programa que calcule e mostre:
     * ■■ o número de pessoas que responderam sim;
     * ■■ o número de pessoas que responderam não;
     * ■■ o número de mulheres que responderam sim; e
     * ■■ a percentagem de homens que responderam não, entre todos os homens
     * analisados.
     */
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        char sexo = ' ', resposta = ' ';
        int sim = 0, nao = 0, mulher = 0, homem = 0, homemNao = 0;
        double perHomem = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("M - Masculino | F - Feminino");
            System.out.println("Informe sexo: ");
            sexo = entrada.next().toUpperCase().charAt(0);
            System.out.println("Sua resposta (S — sim; ou N — não): ");
            resposta = entrada.next().toUpperCase().charAt(0);

            if(resposta == 'S'){
                sim++;
                if (sexo == 'f'){
                    mulher++;
                }
            }else if(resposta == 'N'){
                nao++;
                if (sexo == 'm'){
                    homemNao++;                    
                }
            }
            if(sexo == 'm'){
                homem++;
            }

        }

        System.out.println("Número de pessoas que responderam sim: "+ sim);
        System.out.println("Número de pessoas que responderam não: "+ nao);
        System.out.println("Número de mulheres que responderam sim: "+ mulher);
        if (homem == 0) {
            System.out.println("Nenhum homem respondeu a pesquisa!");
        } else {
            perHomem = homemNao/(double)homem * 100;
            System.out.println("Percentagem de homens que responderam não"
            + perHomem);
        }

        entrada.close();
    }
}
