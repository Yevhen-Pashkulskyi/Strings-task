package removeWord.view;

public class View {
    //    private static int numbering;
    //цей метод робить видалення з масиву всі значення які дорівнюють null
    // та печатає резуьтат у стовчик
    public void printWord(String[] words) {
        int numbering = 1;
        for (String word : words) {
            if (word != null) {
                System.out.println((numbering++) + ")" + word);
            }
        }
    }
}
