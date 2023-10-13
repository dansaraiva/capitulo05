import java.util.Scanner;

public class Atividade18 {
    /*
     * Foi feita uma pesquisa entre os habitantes de uma região.
     * Foram coletados os dados de idade, sexo (M/F) e salário.
     * Faça um programa que calcule e mostre:
     * ■■ a média dos salários do grupo;
     * ■■ a maior e a menor idade do grupo;
     * ■■ a quantidade de mulheres com salário até R$ 200,00;
     * ■■ a idade e o sexo da pessoa que possui o menor salário.
     * Finalize a entrada de dados ao ser digitada uma idade negativa.
     */

    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int idade = 0, contador = 0, maiorIdade = 0, menorIdade = Integer.MAX_VALUE, qtdMulher200 = 0;
        int idadeMenorSalario = 0;
        double salario = 0, somaSalario = 0, menorSalario = Double.MAX_VALUE;
        char sexo = ' ', sexoMenorSalario = ' ';

        while(idade >= 0){
            System.out.print("Informe sua idade: ");
            idade = entrada.nextInt();
            if(idade < 0){
                break;
            }
            System.out.print("Informe seu sexo(F|M): ");
            sexo = entrada.next().toUpperCase().charAt(0);
            System.out.print("Informe seu salário: ");
            salario = entrada.nextDouble();


            if(idade > maiorIdade){
                maiorIdade = idade;
            }
            if(idade < menorIdade){
                menorIdade = idade;
            }
            if(sexo == 'F' && salario <= 200){
                qtdMulher200++;
            }
            if(salario < menorSalario){
                menorSalario = salario;
                idadeMenorSalario = idade;
                sexoMenorSalario = sexo;
            }

            somaSalario += salario;
            contador++;
        }
        System.out.println("Média dos salários do grupo: " + ((double)somaSalario/contador));
        System.out.println("Maior idade: "+ maiorIdade);
        System.out.println("Menor idade: "+ menorIdade);
        System.out.println("Mulheres com salário até R$ 200,00: " +qtdMulher200);
        System.out.println("Idade da pessoa com menor salário: " + idadeMenorSalario);
        System.out.println("Sexo da pessoa com menor salário: "+ sexoMenorSalario);

        entrada.close();
    }
}
