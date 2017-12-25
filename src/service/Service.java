package service;


import model.Model;

import java.util.Random;

public class Service {
    Random ran=new Random();

   public Model create (int y,int x){
        int[][]mass=new int[y][x];
        for(int i=0;i<y;i++){
            for(int j=0;j<x;j++){
                mass[i][j]= ran.nextInt(1000);
            }
        }
        return new Model(mass);
    }

    synchronized public Model multi(Model m1,Model m2){
        int y,x;
             y=m1.toArray().length;
             x=m1.toArray()[0].length;
         int[][] result=new int[y][x];

         for(int i=0;i<y;i++){
            for(int j=0;j<x;j++){
                result[i][j]=m1.toArray()[i][j]*m2.toArray()[i][j];
            }
        }
        return new Model(result);
    }
}
