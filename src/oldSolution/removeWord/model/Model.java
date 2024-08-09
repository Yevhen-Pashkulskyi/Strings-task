package oldSolution.removeWord.model;

public class Model {
    private static String[] words;

    //конструктор
    public Model() {
        words = new String[]{"orange", "plum", "tomato", "onion", "grape", "onion"};
    }

    //в цьому методі я змінюю непотрібне слово на null з масиву
    public void removeWord(String target) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                words[i] = null;
            }
        }
    }

    public String[] getWords() {
        return words;
    }
}
