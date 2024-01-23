package errorSearch;

import errorSearch.controller.Controller;
import errorSearch.model.Model;
import errorSearch.view.View;

public class Main {
    public static void main(String[] args) {
        String[] words = {"brange", "plum", "tomato", "onibn", "grape"};

        Model model = new Model(words);
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.process();
    }
}
