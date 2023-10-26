package com.subs.alphawizard.Array;

public class MakeZeroes {

    static void  MakeZeros(int[][] matrix)
    {
        int n= matrix.length;
        int m=matrix[0].length;
        int[][] temp = matrix;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                temp[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(temp[i][j]==0){
                    if(i+1<n){
                        matrix[i][j]+=temp[i+1][j];
                        matrix[i+1][j]=0;
                    }
                    if(i-1>=0){
                        matrix[i][j]+=temp[i-1][j];
                        matrix[i-1][j]=0;
                    }
                    if(j+1<m){
                        matrix[i][j]+=temp[i][j+1];
                        matrix[i][j+1]=0;
                    }
                    if(j-1>=0){
                        matrix[i][j]+=temp[i][j-1];
                        matrix[i][j-1]=0;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int [][] matrix = {{1, 2, 3, 4},
                           {5, 6, 0, 7},
                           {8, 9, 4, 6},
                           {8, 4, 5, 2}};
        MakeZeros(matrix);
        int n= matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
