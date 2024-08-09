package newSolution.controller;

import newSolution.model.Model;
import newSolution.view.View;

public class AppController {
    public void run(){
        Model model = new Model();
        View view = new View();
        view.output(model.searchData(view.enterData()));
    }

}
