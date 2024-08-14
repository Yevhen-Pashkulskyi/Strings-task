package newSolution.view;

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
            if (s != null) {
                counter++;
                System.out.println(counter + ") " + s);
            }
        }
    }
}
