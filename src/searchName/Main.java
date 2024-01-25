package searchName;

import searchName.controller.Controller;
import searchName.model.Model;
import searchName.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());

        controller.process();
    }
}
