package newSolution.controller;

import newSolution.model.Model;
import newSolution.view.View;

import javax.xml.transform.Source;
import java.util.Scanner;

public class AppController {
    public void run() {
        Model model = new Model();
        View view = new View();
        Scanner scanner = new Scanner(System.in);

        view.outputArray(model.replaceAll(view.task1(), "b", "o"));

        System.out.print("\nЯке слово потрібно видалити з цього списку: \n" + String.join(", ", view.task2())
                + "\nВведіть слово:");
        String delWord = scanner.nextLine();
        view.outputArray(model.delWords(view.task2(), delWord));

        System.out.print("\nЯке ім'я потрібно знайти з цього списку: \n" + String.join(", ", view.task3())
                + "\nВведіть слово:");
        delWord = scanner.nextLine();
        model.searchWords(view.task3(), delWord);
    }

}
