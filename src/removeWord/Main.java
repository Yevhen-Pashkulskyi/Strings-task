package removeWord;

import removeWord.controller.Controller;
import removeWord.model.Model;
import removeWord.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());

        controller.process();
    }
}
