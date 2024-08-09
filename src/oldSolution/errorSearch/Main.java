package oldSolution.errorSearch;

import oldSolution.errorSearch.controller.Controller;
import oldSolution.errorSearch.model.Model;
import oldSolution.errorSearch.view.View;

public class Main {
    public static void main(String[] args) {

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.process();
    }
}
