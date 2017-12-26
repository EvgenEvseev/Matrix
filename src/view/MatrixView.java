package view;

import model.Matrix;
import service.MatrixService;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixView {
    Scanner scan = new Scanner(System.in);
    MatrixService serv = new MatrixService();
    int y = 0, x = 0;
// Метод, реализующий консольный опрос размеров матриц
    synchronized public void Info() {

        System.out.println("Добро пожаловать в приложение. Укажите размер матриц ");
        while (true) {
            System.out.println("Сначала введите количество строк в матрице ");
            if (scan.hasNextInt()) {
                y = scan.nextInt();
                break;
            } else System.out.println("Некоректный ввод данных, введите число ");
            scan.next();
        }
        while (true) {
            System.out.println("Теперь введите количество столбцов в матрице");
            if (scan.hasNextInt()) {
                x = scan.nextInt();
                break;
            } else System.out.println("Некоректный ввод данных, введите число ");
            scan.next();
        }
    }
// Метод, реализующий консольный опрос для заполнения матрицы значениями
    synchronized public Matrix Next() {

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("\nВыберите режим ввода в матрицу: ");
            System.out.println("1. Автоматический ввод");
            System.out.println("2. Ручной ввод");
            System.out.println("3. Выход из приложения");
            int n = 0;
            if (scan.hasNextInt()) {
                n = scan.nextInt();
            } else System.out.println("Некоректный ввод данных, введи число от 1 до 3");

            switch (n) {
                case 1:
                    System.out.println("Выбран Автоматический режим ввода данных");
                    System.out.println("Спасибо ! Матрица заполнена:");
                    Matrix m1;
                    m1=serv.Create(y, x);
                    for (int k = 0; k < m1.toArray().length; k++) {
                        System.out.println(Arrays.toString(m1.toArray()[k]));};
                    return m1;


                case 2:
                    System.out.println("Выбран Ручной режим ввода данных");
                    int i;
                    int j;
                    int[][] mass = new int[y][x];
                    for (i = 0; i < y; i++) {
                        System.out.println("Введите числа в строку " + i);
                        for (j = 0; j < x; j++) {
                            while (true) {
                                System.out.println("Введите число с индексом " + "[" + i + "]" + "[" + j + "] .");
                                if (scan.hasNextInt()) {
                                    mass[i][j] = scan.nextInt();
                                    break;
                                } else System.out.println("Некоректный ввод данных, введите число ");
                                scan.next();
                            }
                        }
                    }
                    System.out.println("Спасибо ! Матрица заполнена:");
                    for (int k = 0; k < mass.length; k++) {
                        System.out.println(Arrays.toString(mass[k]));};
                    return new Matrix(mass);

                case 3:
                    System.out.println("Выход");
                    System.exit(0);
            }
        }
    }


    // Метод выводящий результат перемножения двух матриц
    synchronized public void endMess(Matrix m){
        System.out.println("\nМатрицы были перемножены, далее - полученный результат:\n");
        for (int i = 0; i < m.toArray().length; i++) {
            System.out.println(Arrays.toString(m.toArray()[i]));};
    }
}


