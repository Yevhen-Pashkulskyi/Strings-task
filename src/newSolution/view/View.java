package newSolution.view;

import java.util.Scanner;

public class View {

    public String[] task1() {
        return new String[]{"brange", "plum", "tomato", "onibn", "grape"};
    }

    public String[] task2() {
        return new String[]{"orange", "plum", "tomato", "onion", "grape", "onion"};
    }

    public String[] task3() {
        return new String[]{"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};
    }

    public void outputArray(String[] output) {
        int counter = 0;
        for (String s : output) {
            counter++;
            System.out.println(counter + ") " + s);
        }
    }

    public void print(String output) {
        System.out.println(output);
    }

    private String enterVal() {
        return new Scanner(System.in).nextLine();
    }

    /* public String[] enterData(int amountOfData) {

        String[] data = new String[amountOfData];
        Person persons = new Person();
        int counter = 0;

        do {
            System.out.print("Enter name Person: ");//Enter the name product or name Person:
            data[counter] = persons.setName(enterVal());
            counter++;
        } while (counter < amountOfData);
        return data;
    }
*/
}
