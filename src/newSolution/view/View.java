package newSolution.view;

import java.util.Scanner;

public class View {

    public String[] enterData(int amountOfData) {
        Scanner sc = new Scanner(System.in);
        String[] data = new String[amountOfData];
        int counter = 0;
        do {
            System.out.print("Enter the name product or name Person: ");
            data[counter] = sc.nextLine();
            counter++;
        } while (counter < data.length);
        return data;
    }

    public void output(String[] output) {
        int counter = 0;
        for (String s : output) {
            counter++;
            System.out.println(counter + ") " + s);
        }
    }
}
