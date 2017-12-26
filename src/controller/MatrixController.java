package controller;

import model.Matrix;
import service.MatrixService;
import view.MatrixView;

public class MatrixController {
    public  void start() {
        MatrixService serv = new MatrixService();
        MatrixView vi=new MatrixView();

       Matrix m1;
       Matrix m2;
       Matrix result;

       //опрос размера матриц
       vi.info();

       // опрос для заполнения двух матриц
       m1=vi.setMatrixData();
       m2=vi.setMatrixData();

       //перемножение матриц
       result=serv.matrixMultiplication(m1,m2);
        //вывод результата перемножения
       vi.endMess(result);
    }
}
