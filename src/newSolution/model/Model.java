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
    public String[] replaceAll(String[] oldData, String search, String replacement) {
        String[] newData = new String[oldData.length];
        int counter = 0;
        for (String s : oldData) {
            newData[counter] = s.replaceAll(replacement, search);
            counter++;
        }return newData;
    }
}
