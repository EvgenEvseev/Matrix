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
       vi.Info();

       // опрос для заполнения двух матриц
       m1=vi.Next();
       m2=vi.Next();

       //перемножение матриц
       result=serv.MatrixMultiplication(m1,m2);
        //вывод результата перемножения
       vi.endMess(result);
    }
}
