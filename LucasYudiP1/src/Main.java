import java.util.Scanner;

/* ENUNCIADO:
    Tema: Entrega do Oscar
    Elabore um programa que solicite que o usuário insira o nome de quatro filmes, que deverão ser armazenados em um
    vetor. Depois, o usuário deverá preencher uma matriz 3x4, que serão as notas dos filmes de 0 a 10. Cada coluna deverá
    corresponder a um filme, e cada filme terá três notas.
    A partir disto, execute as seguintes tarefas:
    - Crie um vetor com as médias de cada filme e exiba.
    - Exiba a média do filme vencedor (maior média).
    - Procure filmes com média abaixo de 5, caso haja, exiba "Teve filme ruim!". Caso não haja, exiba "Só filme bom!".
 */
public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    private static void preencherMatriz(Double[][] matriz) {
        for (int coluna = 0; coluna < matriz[0].length; coluna++) {
            for (int linha = 0; linha < matriz.length; linha++) {
                System.out.println(String.format("Digite a %sº nota do %sº filme", linha+1, coluna+1));
                matriz[linha][coluna] = scanner.nextDouble();
            }
        }
    }

    private static void exibirMatriz(Double[][] matriz) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }

    private static Double[] mediaMatriz(Double[][] matriz) {
        Double[] vetorTotal = new Double[matriz[0].length];
        for (int coluna = 0; coluna < matriz[0].length; coluna++) {
            Double soma = 0d;
            for (int linha = 0; linha < matriz.length; linha++) {
                if (vetorTotal[coluna] == null)
                    vetorTotal[coluna] = 0d;
                soma += matriz[linha][coluna];
            }
            vetorTotal[coluna] = soma / matriz.length;
        }
        return vetorTotal;
    }

    private static void preencherVetor(String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(String.format("Insira o %sº filme", i+1));
            vetor[i] = scanner.nextLine();
        }
    }

    private static void exibirVetor(Object[] vetor) {
        for (Object item : vetor) {
            System.out.print(item + "\t");
        }
        System.out.println();
    }

    private static Double maiorValor(Double[] vetor) {
        Double max = Double.NEGATIVE_INFINITY;
        for (Double item : vetor) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    private static boolean vetorTemValorMenorQue(Double[] vetor, Double valor) {
        for (Double item : vetor) {
            if (item < valor) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] filmes = new String[4];
        Double[][] notas = new Double[3][4];
        Double[] medias = new Double[4];

        preencherVetor(filmes);
        preencherMatriz(notas);

        medias = mediaMatriz(notas);

        System.out.println("Médias: ");
        exibirVetor(filmes);
        exibirVetor(medias);

        System.out.println("Maior média: ");
        System.out.println(maiorValor(medias));

        if (vetorTemValorMenorQue(medias, 5d))
            System.out.println("Teve filme ruim!");
        else
            System.out.println("Só filme bom!");
    }
}
