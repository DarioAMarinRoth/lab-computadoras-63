package teoria;

import static utils.Funciones.printMatrix;

public class Matrices {
    public static void main(String[] args) {
//        int[][] unArray = new int[5][3];
//        unArray[3][1] = 4;
//
//        System.out.println(unArray[0].length);
//
//        // un vector de enteros
//
////        int[] miVector = new int[10];
////
////        System.out.println(miVector.length);

        int[][] miMatriz = {{1, 0, 0},{0, 1, 100},{1000, 2, 4},{0, 1000000, 5}};
        printMatrix(miMatriz);
    }
}
