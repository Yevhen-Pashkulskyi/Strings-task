package newSolution.model;


public class Model {
    private String[] arr;

    public String[] replaceAll(String[] oldData, String replacement, String search) {
        String[] newData = new String[oldData.length];
        int counter = 0;
        for (String s : oldData) {
            newData[counter] = s.replaceAll(replacement, search);
            counter++;
        }
        return newData;
    }
    //TODO зробити цей метод вірно ↓
    public String[] delWords(String[] value, String word) {
        StringBuilder newSb = new StringBuilder();
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(word)) {
                newSb.delete(0, newSb.length());
            }
        }
        return newSb.toString().split(word);
    }

    public void searchWords(String[] value, String word) {
        int counter = 0;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(word)) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.print("\nТакого імені немає: " + word);
        } else {
            System.out.printf("\nІм'я %s є в списку!\nКількість: %d", word, counter);
        }
    }

    public String delVal(String oldData, String val) {
        int sizeDelVal = 0;
        for (int i = 0; i < val.length(); i++) {
            sizeDelVal++;
        }

        int start;
        int end;
        StringBuilder newData = new StringBuilder(oldData);
        for (int i = 0; i < oldData.length(); i++) {
            if (oldData.indexOf(val) > 1) {
                start = oldData.indexOf(val);
                end = start + sizeDelVal;
                oldData = String.valueOf(newData.delete(start, end));
            } else {
                break;
            }
        }
        return newData.toString();
    }

    //перетворення в строку
    public String conversionIntoTerm(String[] oldData) {
        StringBuilder newSb = new StringBuilder();
        for (String s : oldData) {
            newSb.append(s).append("\n");
        }
        return newSb.toString();
    }
}
