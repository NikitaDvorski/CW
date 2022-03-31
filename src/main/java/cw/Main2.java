package cw;

public class Main2 {
    public static void main(String[] args) {
        int matrixA[][] = new int[(int) (5 + Math.random()*3)][(int) (5 + Math.random()*3)];
        for (int i = 0; i< matrixA.length; i++){
            for (int j = 0; j< matrixA.length;j++){
                matrixA[i][j]= (int) (Math.random()*99);
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }
    }
}
