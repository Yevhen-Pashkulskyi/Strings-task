package errorSearch;

import errorSearch.controller.Controller;
import errorSearch.model.Model;
import errorSearch.view.View;

public class Main {
    public static void main(String[] args) {

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.process();
    }
}
