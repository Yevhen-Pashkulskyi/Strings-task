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

    public String delVal(String oldData, String val) {
        int sizeDelVal = 0;
        for (int i = 0; i < val.length(); i++) {
            sizeDelVal++;
        }

        int start;
        int end;
        StringBuilder newData = new StringBuilder(oldData);
        for (int i = 0; i < oldData.length(); i++) {
            if (oldData.indexOf(val) > 1) {
                start = oldData.indexOf(val);
                end = start + sizeDelVal;
                oldData = String.valueOf(newData.delete(start, end));
            } else {
                break;
            }
        }
        return newData.toString();
    }

    //перетворення в строку
    public String conversionIntoTerm(String[] oldData) {
        StringBuilder newSb = new StringBuilder();
        for (String s : oldData) {
            newSb.append(s).append("\n");
        }
        return newSb.toString();
    }
    public String[] delWords(String[] value, String word) {
        StringBuilder newSb = new StringBuilder();
        for (int i = 0; i < value.length; i++) {

        }
    }
}
