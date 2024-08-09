package newSolution.model;


public class Model {
    private String[] arr;

    public String[] searchData(String[] data) {
        arr = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            arr[i] = data[i];
        }
        return arr;
    }
}
