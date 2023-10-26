package com.subs.alphawizard.Array;

public class RotateMatrixBy90 {

    static void swap(int[][] matrix, int i,int j) {

        int temp = matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;

    }

     static void transpose(int[][] matrix) {
         int n=matrix.length;
         for (int i=0;i<n;i++){
             for(int j=0;j<i;j++){
              swap(matrix,i,j);
             }
         }
    }
    static void rotateBy90(int[][] matrix,int n) {
        for (int i=0;i<n/2;i++){
            for(int j=0;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[n-i-1][j];
                matrix[n-i-1][j]=temp;
            }
        }
    }


    public static void main(String[] args) {

        int [][] matrix = {{1, 2, 3, 4},
                           {5, 6, 0, 7},
                           {8, 9, 4, 6},
                           {7, 4, 5, 2}};
        transpose(matrix);
        int n= matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        rotateBy90(matrix,n);
        System.out.println("After Rotating 90....");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
