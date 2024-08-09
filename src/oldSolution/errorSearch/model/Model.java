package oldSolution.errorSearch.model;

public class Model {
    private String[] words;

    public Model() {
        this.words = new String[]{"brange", "plum", "tomato", "onibn", "grape"};
    }

    //в цьому методі я виправляю слова
    public void wordsCorrection() {
        for (int i = 0; i < words.length; i++) {
            words[i] = wordCorrection(words[i]);
        }
    }

    private String wordCorrection(String word) {
        return word.replace('b', 'o');
    }

    public String[] getWords() {
        return words;
    }
}
