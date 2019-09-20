import java.util.Scanner;

public class Ex1e2 {

    public static void main(String[] args) {

        Integer[][] matriz1 = new Integer[2][3];
        Integer[][] matriz2 = new Integer[2][3];

        MatrizHandler.preencherMatriz(matriz1);
        MatrizHandler.preencherMatriz(matriz2);

        Integer[][] matrizSomada = MatrizHandler.somarMatrizes(matriz1, matriz2);

        MatrizHandler.exibirMatriz(matriz1);
        MatrizHandler.exibirMatriz(matriz2);
        MatrizHandler.exibirMatriz(matrizSomada);
    }
}
