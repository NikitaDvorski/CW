package cw;

public class Main {
    public static void main(String[] args) {
        int [][]matrixA = {
                {-9,1,0},
                {4,1,1},
                {-2,2,-1}
        };
        for (int i=0;i< args.length;i++){
            for (int j=0;j< matrixA.length;j++){
                System.out.println(matrixA[i][j] + ' ');
            }
            System.out.println();
        }
    }
}