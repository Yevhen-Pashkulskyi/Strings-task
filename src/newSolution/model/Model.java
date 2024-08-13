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

    public String deleteValue(String oldData, String delVal) {
        int sizeDelVal = 0;
        for (int i = 0; i < delVal.length(); i++) {
            sizeDelVal++;
        }
//        String separatorWord = " ";
        String newData;

        return newData;
    }
    //перетворення в строку

    public String conversionIntoTerm(String[] oldData) {
        StringBuilder newSb = new StringBuilder();
        for (int i = 0; i < oldData.length; i++) {
           newSb.append(oldData[i]).append(" ");
        }return newSb.toString();
    }
}
