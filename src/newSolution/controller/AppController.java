package newSolution.controller;

import newSolution.model.Model;
import newSolution.view.View;

import java.util.Scanner;

public class AppController {
    public void run(){
        Model model = new Model();
        View view = new View();
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter amount of data: ");
//        view.output(model.searchData(view.enterData(scanner.nextInt())));
        String[] arrProduct = new String[]{"brange", "plum", "tomato", "onibn", "grape"};
        view.output(model.replaceAll(arrProduct,"b","o"));
        view.toString(model.deleteValue(arrProduct,"orange"));
    }

}
