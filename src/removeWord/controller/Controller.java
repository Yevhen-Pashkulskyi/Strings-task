package removeWord.controller;

import removeWord.model.Model;
import removeWord.view.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    //    цей метод запускає весь процесс пошуку , видалення , та печаті результату
    public void process() {
        //змінюю onion на null
        model.removeWord("onion");
        //записую результат в новий масив
//        String []words = model.getWords();
        //печатаю його
        view.printWord(model.getWords());
    }
}
