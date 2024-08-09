package oldSolution.searchName;

import oldSolution.searchName.controller.Controller;
import oldSolution.searchName.model.Model;
import oldSolution.searchName.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());

        controller.process();
    }
}
