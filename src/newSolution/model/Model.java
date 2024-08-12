package newSolution.model;


public class Model {
    private String[] arr;

//    public String[] getData(String data) {
//        arr = new String[data.length];
//        for (int i = 0; i < data.length; i++) {
//            arr[i] = data[i];
//        }
//        return arr;
//    }

    public String[] replaceAll(String[] oldData, String replacement, String search) {
        String[] newData = new String[oldData.length];
        int counter = 0;
        for (String s : oldData) {
            newData[counter] = s.replaceAll(replacement, search);
            counter++;
        }
        return newData;
    }

    public String[] deleteValue(String[] oldData, String delVal) {
        String[] newData = new String[6];
        int counter = 0;
        for (String s : oldData) {
            if (s.equals(delVal)) {
               s = s.replace(oldData[counter], "");
            }
            newData[counter] = s;
            counter++;
        }
        return newData;
    }
}
