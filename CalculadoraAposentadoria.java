import java.util.Scanner;

class CalculadoraAposentadoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite o sexo (M/F):");
        char sexo = scanner.next().charAt(0);

        System.out.println("Digite os anos de contribuição:");
        int anosContribuicao = scanner.nextInt();

        int idadeMinima = (sexo == 'M') ? 65 : 60;
        int tempoContribuicaoMinimo = 35;

        if (idade >= idadeMinima || anosContribuicao >= tempoContribuicaoMinimo) {
            System.out.println("Você já pode se aposentar.");
        } else {
            int anosFaltantes = Math.max(idadeMinima - idade, tempoContribuicaoMinimo - anosContribuicao);
            System.out.println("Faltam " + anosFaltantes + " anos para você se aposentar.");
        }
    }
}

