package service;


import model.Matrix;

import java.util.Random;

public class MatrixService {
    Random ran=new Random();
//Метод для автоматического формирования матрицы
   public Matrix Create (int y, int x){
        int[][]mass=new int[y][x];
        for(int i=0;i<y;i++){
            for(int j=0;j<x;j++){
                mass[i][j]= ran.nextInt(1000);
            }
        }
        return new Matrix(mass);
    }
// Метод, перемнажающий две матрицы
    synchronized public Matrix MatrixMultiplication(Matrix m1, Matrix m2){
        int y,x;
             y=m1.toArray().length;
             x=m1.toArray()[0].length;
         int[][] result=new int[y][x];

         for(int i=0;i<y;i++){
            for(int j=0;j<x;j++){
                result[i][j]=m1.toArray()[i][j]*m2.toArray()[i][j];
            }
        }
        return new Matrix(result);
    }
}
