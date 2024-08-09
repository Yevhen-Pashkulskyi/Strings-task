package oldSolution.removeWord;

import oldSolution.removeWord.controller.Controller;
import oldSolution.removeWord.model.Model;
import oldSolution.removeWord.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());

        controller.process();
    }
}
