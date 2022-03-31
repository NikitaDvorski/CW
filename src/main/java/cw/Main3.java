package cw;

public class Main3 {
    public static void main(String[] args) {
        int sum = 0;
        int [][]matrixA = {
              {-9,1,0},
              {4,1,1},
                {-2,2,-1}
      };
        for (int i = 0; i< matrixA.length; i++){
            for (int j = 0; j< matrixA.length;j++){
                sum = sum + matrixA[i][j];
            }
        }
        System.out.println(sum);
    }
}
