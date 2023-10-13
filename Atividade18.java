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
        System.out.print("\033[H\033[2J");
        System.out.flush();

        /*
         * \033 é o código de escape ANSI, que é usado para iniciar uma sequência de
         * escape.
         * [H é uma parte da sequência que move o cursor para a posição especificada na
         * tela. Neste caso, \033[H move o cursor para a posição superior esquerda (0,0)
         * da tela.
         * [2J é outra parte da sequência que limpa a tela. Ele instrui o terminal a
         * apagar todo o conteúdo da tela.
         * Quando você imprime essa sequência no terminal, o cursor é movido para o
         * canto superior esquerdo e a tela é apagada, proporcionando uma "limpeza"
         * visual. Após o System.out.flush(), a tela estará limpa, e você pode continuar
         * com a execução do seu programa.
         * 
         * 
         * Cores de Texto (FG) (ForeGround):
         * 
         * 30: Preto
         * 31: Vermelho
         * 32: Verde
         * 33: Amarelo
         * 34: Azul
         * 35: Magenta (roxo)
         * 36: Ciano (azul claro)
         * 37: Branco
         * Cores de Fundo (BG) (BackGround):
         * 
         * 40: Preto
         * 41: Vermelho
         * 42: Verde
         * 43: Amarelo
         * 44: Azul
         * 45: Magenta (roxo)
         * 46: Ciano (azul claro)
         * 47: Branco
         * Estilo de Texto:
         * 
         * 0: Padrão (sem negrito, itálico, sublinhado)
         * 1: Negrito
         * 2: Fraco intensidade (geralmente é o mesmo que não negrito)
         * 3: Itálico (nem sempre suportado)
         * 4: Sublinhado
         * 5: Piscando (nem sempre suportado)
         * 7: Inverter as cores de texto e fundo
         * 9: Tachado (cruzado, nem sempre suportado)
         * 
         * Por exemplo, para definir o texto em vermelho no fundo amarelo, você pode
         * usar \033[31;43m. Para definir o texto em negrito e vermelho no fundo verde,
         * use \033[1;31;42m.
         * 
         */

        var entrada = new Scanner(System.in);
        int idade = 0, contador = 0, maiorIdade = 0, menorIdade = Integer.MAX_VALUE, qtdMulher200 = 0;
        int idadeMenorSalario = 0;
        double salario = 0, somaSalario = 0, menorSalario = Double.MAX_VALUE;
        char sexo = ' ', sexoMenorSalario = ' ';

        while (idade >= 0) {
            System.out.print("Informe sua \033[1m idade: \033[0m");
            idade = entrada.nextInt();
            if (idade < 0) {
                System.out.println("Você decidiu sair. Até mais!");
                break;
            }
            System.out.print("Informe seu \033[1msexo(F|M):\033[0m ");
            sexo = entrada.next().toUpperCase().charAt(0);
            System.out.print("Informe seu \033[1msalário:\033[0m ");
            salario = entrada.nextDouble();

            System.out.print("\033[H\033[2J");
            System.out.flush();

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }
            if (sexo == 'F' && salario <= 200) {
                qtdMulher200++;
            }
            if (salario < menorSalario) {
                menorSalario = salario;
                idadeMenorSalario = idade;
                sexoMenorSalario = sexo;
            }

            somaSalario += salario;
            contador++;
        }
        if (menorIdade != Integer.MAX_VALUE) {
            System.out.println("Média dos salários do grupo: " + ((double) somaSalario / contador));
            System.out.println("Maior idade: " + maiorIdade);
            System.out.println("Menor idade: " + menorIdade);
            System.out.println("Mulheres com salário até R$ 200,00: " + qtdMulher200);
            System.out.println("Idade da pessoa com menor salário: " + idadeMenorSalario);
            System.out.println("Sexo da pessoa com menor salário: " + sexoMenorSalario);
        } else {
            System.out.println("Idade menor que ZERO! Sem dados para exibir!");
        }

        entrada.close();
    }
}
