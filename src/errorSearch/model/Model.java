package errorSearch.model;

public class Model {
    private String[] words;

    public Model(String[] words) {
        this.words = words;
    }

    public void wordsCorrection() {
        for (int i = 0; i < words.length; i++) {
            words[i] = wordCorrection(words[i]);
        }
    }

    private String wordCorrection(String word) {
        return word.replace('b', 'o');
    }

}
