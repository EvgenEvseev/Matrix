package controller;

import model.Model;
import service.Service;
import view.View;

public class Controller {
    public static void main(String[] args) {
        Service serv = new Service();
        View vi=new View();

       Model m1;
       Model m2;
       Model result;

       vi.info();

       m1=vi.next();
       m2=vi.next();

       result=serv.multi(m1,m2);

       vi.endMess(result);
    }
}
