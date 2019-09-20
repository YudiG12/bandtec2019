import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Ex3 {
    public static void main(String[] args) {
        Integer[][] matriz = new Integer[3][3];

        MatrizHandler.preencherMatriz(matriz);
        MatrizHandler.exibirMatriz(matriz);
        MatrizHandler.somarTotalMatriz(matriz);
        for (Integer item : MatrizHandler.somarTotalMatriz(matriz)) {
            System.out.print(item + "\t");
        }

    }
}
