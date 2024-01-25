package searchName.controller;

import searchName.view.View;
import searchName.model.Model;

import java.util.Scanner;

public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void process(Model model, View view) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ім'я пошуку в спіску: ");
        String name = scanner.nextLine();
        // рахує скільки раз співпадає ім'я яке було введено
        int count = model.counter(name);
        // печатає ім'я та його кількість співпадіння
        view.print(name, count);
    }
}
