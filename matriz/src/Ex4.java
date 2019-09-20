import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[][] matriz = new String[5][2];
        MatrizHandler.preencherMatriz(matriz);
        MatrizHandler.exibirMatriz(matriz);

        System.out.println("Pesquise um nome");
        scanner.nextLine();


    }
}
