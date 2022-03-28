package cw;

public class Main {
    public static void main(String[] args) {
//        int [][]matrixA = {
//                {-9,1,0},
//                {4,1,1},
//                {-2,2,-1}
//        };
//        for (int i=0;i< matrixA.length;i++){
//            for (int j=0;j< matrixA.length;j++){
//                System.out.print(matrixA[i][j] + " ");
//            }
//            System.out.println();
//        }

        int [][]matrixA = new int [3][3];
        for (int i=0; i< matrixA.length;i++){
            for(int j=0;j< matrixA.length;j++){
                if ((i + j) % 2 == 0){
                    System.out.print("+" + " ");
                } else {
                    System.out.print("-" + " ");
                }
            }
            System.out.println();
        }
  }
}