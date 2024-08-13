package newSolution.view;

import newSolution.entity.Person;

import java.util.Scanner;

public class View {

    public String[] enterData(int amountOfData) {

        String[] data = new String[amountOfData];
        Person persons = new Person();
        int counter = 0;

        do {
            System.out.print("Enter name Person: ");//Enterthe name product or name Person:
            data[counter] = persons.setName(enterVal());
            counter++;
        } while (counter < amountOfData);
        return data;
    }

    public void outputArray(String[] output) {
        int counter = 0;
        for (String s : output) {
            counter++;
            System.out.println(counter + ") " + s);
        }
    }

    public void printColumn(String output) {
        System.out.println(output);
    }

    private String enterVal() {
        return new Scanner(System.in).nextLine();
    }
}
