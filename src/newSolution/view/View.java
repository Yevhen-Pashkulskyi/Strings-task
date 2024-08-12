package newSolution.view;

import newSolution.entity.Person;

import java.util.Scanner;

public class View {

    public String[] enterData(int amountOfData) {
        Scanner sc = new Scanner(System.in);
        String[] data = new String[amountOfData];
        Person persons = new Person();
        int counter = 0;

        do {
            System.out.print("Enter name Person: ");//Enterthe name product or name Person:
            data[counter] = persons.setName(sc.nextLine());
            counter++;
        } while (counter < amountOfData);
        return data;
    }

    public void output(String[] output) {
        int counter = 0;
        for (String s : output) {
            counter++;
            System.out.println(counter + ") " + s);
        }
    }

    public void print(String output) {
        System.out.println(output);
    }
}
