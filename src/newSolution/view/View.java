package newSolution.view;

import java.util.Scanner;

public class View {

    public String[] enterData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        String data1 = sc.nextLine();
        System.out.print("Enter value: ");
        String data2 = sc.nextLine();
        return new String[]{data1, data2};
    }

    public void output(String[] output) {
        int counter = 0;
        for (String s : output) {
            counter++;
            System.out.println(counter + ") " + s);
        }
    }
}
