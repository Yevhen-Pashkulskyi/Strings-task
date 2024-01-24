package errorSearch.view;

public class View {
    private static int numbering = 1;

    public void printWords(String[] words) {
        for (int i = 0; i < words.length; i++) {
            System.out.println((numbering++) + ") " + words[i]);
        }
    }
}

