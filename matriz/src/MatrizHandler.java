import com.sun.deploy.util.StringUtils;

import java.util.Scanner;

public class MatrizHandler {

    static final Scanner scanner = new Scanner(System.in);

    private static boolean isNumeric(String strNum) {
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }

    public static Integer[] somarTotalMatriz(Integer[][] matriz) {
        Integer[] vetorTotal = new Integer[matriz[0].length];
        for (int coluna = 0; coluna < matriz[0].length; coluna++) {
            for (int linha = 0; linha < matriz.length; linha++) {
                if (vetorTotal[coluna] == null)
                    vetorTotal[coluna] = 0;
                vetorTotal[coluna] += matriz[linha][coluna];
            }
        }
        return vetorTotal;
    }

    public static Integer[][] somarMatrizes(Integer[][] matriz1, Integer[][] matriz2) {
        Integer[][] matrizSomada = new Integer[matriz1.length][matriz1[0].length];
        for (int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1[0].length; coluna++) {
                matrizSomada[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
            }
        }
        return matrizSomada;
    }

    public static void preencherMatriz(Object[][] matriz) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.println(String.format("Digite o valor matriz[%s][%s]", linha, coluna));
                String valor = scanner.nextLine();
                matriz[linha][coluna] = (isNumeric(valor) && !matriz.getClass().getName().contains("String")) ? Integer.parseInt(valor) : valor;
            }
        }
    }

    public static void exibirMatriz(Object[][] matriz) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }
}
