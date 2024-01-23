package errorSearch.controller;

import errorSearch.model.Model;
import errorSearch.view.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void process() {
        model.wordsCorrection();
        String[] wordCorrected = model.getWords();
        view.printWords(wordCorrected);

    }
}
