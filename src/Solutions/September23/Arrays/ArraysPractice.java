package Solutions.September23.Arrays;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        int sum = 0;
        int[] nums = {4,7,1,9,12};

        for (int num : nums){
            sum += num;
        }
        System.out.println(sum);


        System.out.println("*******************************************************************");

        int[] largestNum = {15, 23, 7, 42, 30, 5};
        int biggest = 0;
        for (int num : largestNum){
            if (num > biggest){
                biggest = num;
            }
        }
        System.out.println(biggest);

        System.out.println("*******************************************************************");

        int[] sequence = {1, 3, 5, 7, 9};

        for (int i = sequence.length-1; i>= 0 ; i--){
            System.out.print(sequence[i] + ", ");
        }

        System.out.println("*******************************************************************");

        int[] elements = {2, 4, 2, 8, 3, 2, 9};
        int num = 2;
        int count = 0;

        for (int number : elements){
            if (number == num){
                count++;
            }
        }
        System.out.println(count);

        System.out.println("*******************************************************************");

        int[] grades = {85, 90, 78, 88, 76, 93};
        int total = 0;
        for (int n : grades){
            total+= n;
        }

        int average = total / grades.length;
        System.out.println(average);

        System.out.println("*******************************************************************");

        int[] a = {5, 10, 15, 20, 25};
        int[] b = new int[5];

        for (int element = 0 ; element< a.length ; element++){
            b[element] = a[element];
        }

        for (int k : b){
            System.out.print(k + ",");
        }

        System.out.println("*******************************************************************");

        boolean duplicate = true;
        int counter = 0;
        int[] testArray = {3, 7, 3, 1, 9, 8};

        for (int i = 0 ; i < testArray.length ; i++){
            for (int j = i+1 ; j < testArray.length; j++){
                if (testArray[i] == testArray[j]){
                    counter ++;
                    break;
                }
            }
        }
        System.out.println(counter + " duplicates found");

        System.out.println("*******************************************************************");

        int[][] matrix = new int[2][3];
        matrix [0][0] = 1;
        matrix [0][1] = 2;
        matrix [0][2] = 3;
        matrix [1][0] = 4;
        matrix [1][1] = 5;
        matrix [1][2] = 6;

        System.out.println(Arrays.deepToString(matrix));

        for (int i = 0 ; i < matrix.length ; i++){
            for (int j = 0 ; j <= matrix.length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("*******************************************************************");


        int [][] squareMatrix = {{9, 2, 3},
                                 {4, 5, 6},
                                 {7, 8, 1}};

        // 00 = 9 11 = 5 22 = 1

        int diagonalSum = 0;

        for (int i = 0 ; i < squareMatrix.length ; i++){
            diagonalSum += squareMatrix[i][i];
        }

        System.out.println(diagonalSum);

        System.out.println("*******************************************************************");

        int[][] array2d = {{1, 2, 3},{4,5,6,},{7,8,9}};

     /* int sumOne = 0;
      int sumTwo = 0;
      int sumThree = 0;

      for (int i = 0 ; i < array2d.length ; i++){
          sumOne += array2d[0][i];
          sumTwo += array2d[1][i];
          sumThree += array2d[2][i];

      }
        System.out.println(sumOne);
        System.out.println(sumTwo);
        System.out.println(sumThree);*/


        for(int i = 0 ; i < array2d.length ; i++){
            int sumArray = 0 ;
            for (int j = 0 ; j < array2d[i].length ; j++){
                sumArray += array2d[i][j];
            }
            System.out.println("Sum of row" + (i + 1) + " = " + sumArray);
        }
        System.out.println("*******************************************************************");


        // 00 + 10 + 20
        for (int i = 0 ; i < array2d.length; i++){
            int sumColumn = 0;
            for (int j = 0 ; j < array2d[i].length ; j++ ){
                sumColumn += array2d[j][i]; }

            System.out.println("Sum of column " + (i + 1) + ": " + sumColumn );
        }

        System.out.println("*******************************************************************");

        // 00 10 20    01 11 21
        int [][] matrix2 = {{1,2}
                           ,{3,4}
                           ,{5,6}};

        for (int i = 0 ; i < matrix2.length - 1 ; i++){
            System.out.print(" [ ");
            for(int j = 0 ; j < matrix2.length  ; j++) {
                System.out.print(matrix2[j][i] + " ");}
            System.out.print(" ] ");
            System.out.println();
        }

        System.out.println("*******************************************************************");

        int[][] matrixX = {{1,2},
                           {3,4}};
        int[][] matrixY = {{2,0},
                           {1,3}};
        int[][] resultMatrix = new int[2][2];

       /* for (int i = 0 ; i < matrixX.length ; i++){
            for(int j = 0 ; j < matrixX[i].length ; j++){
               resultMatrix[i][j] = matrixY[i][j] * matrixX[i][j];

            }

        }
        System.out.println(Arrays.deepToString(resultMatrix));*/

        // This is the wrong Answer








    }

}
