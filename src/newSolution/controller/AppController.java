package newSolution.controller;

import newSolution.model.Model;
import newSolution.view.View;

import javax.xml.transform.Source;
import java.util.Scanner;

public class AppController {
    public void run(){
        Model model = new Model();
        View view = new View();
        Scanner scanner = new Scanner(System.in);
        String[] task1 = {"brange", "plum", "tomato", "onibn", "grape"};
        String[] task2 = {"orange", "plum", "tomato", "onion", "grape", "onion"};
        String[] task3 = {"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};

        view.outputArray(model.replaceAll(task1, "b","o"));
        System.out.print("\nЯке слово потрібно видалити з цього списку: \n" + String.join(", ", task2)
                + "\nВведіть слово:" );
        String delWord = scanner.nextLine();

    }

}
