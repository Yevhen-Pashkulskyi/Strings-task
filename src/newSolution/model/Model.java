package newSolution.model;


public class Model {

    public String[] replaceAll(String[] oldData, String replacement, String search) {
        String[] newData = new String[oldData.length];
        int counter = 0;
        for (String s : oldData) {
            newData[counter] = s.replaceAll(replacement, search);
            counter++;
        }
        return newData;
    }

    public String[] delWords(String[] value, String word) {
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(word)) {
                value[i] = null;
            }
        }
        return value;
    }

    public void searchWords(String[] value, String word) {
        int counter = 0;
        for (String s : value) {
            if (s.equals(word)) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.print("\nТакого імені немає: " + word);
        } else {
            System.out.printf("\nІм'я %s є в списку!\nКількість: %d", word, counter);
        }
    }
}
