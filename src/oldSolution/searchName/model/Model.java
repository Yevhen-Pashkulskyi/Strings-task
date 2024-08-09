package oldSolution.searchName.model;

public class Model {
    private static String[] names;

    public Model() {
        this.names = new String[]{"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};
    }

    //цей метод рахує скільки є совподінь з масивом
    public int counter(String name) {
        int count = 0;
        // цикл for each записує в перменну n данні з масиву names
        for (String n : names) {
            //ця умова виключає пусті індекси та які не совпали
            if (n != null && n.equalsIgnoreCase(name)) {
                count++;
            }
        }
        return count;
    }

    public static String[] getNames() {
        return names;
    }
}
