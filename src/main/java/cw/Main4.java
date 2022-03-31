package cw;

import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int matrixA[][] = new int[3][3];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                matrixA[i][j] = (int) (-10 + (Math.random() * 20));
                if (matrixA[i][j] < 0) {
                    System.out.println("(" + i + "; " + j + ")");
                }
        }
    }
        for (int v=0; v< matrixA.length;v++){
            System.out.println(Arrays.toString(matrixA[v]));}
    }
}

