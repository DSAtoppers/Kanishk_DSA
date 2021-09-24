package sept2421;

import java.util.ArrayList;
import java.util.Arrays;

public class Code1078 {

    public static String[] findOcurrences(String text, String first, String second) {
        String[] arr = text.split("\\s+");
        ArrayList<String> arrayList = new ArrayList<>();
        int i = 0;
        while (i <= arr.length-3){
            if (arr[i].equals(first) && arr[i+1].equals(second)){
                arrayList.add(arr[i+2]);
            }
            i++;
        }

        String[] main = new String[arrayList.size()];
        return arrayList.toArray(main);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findOcurrences("ypkk lnlqhmaohv lnlqhmaohv lnlqhmaohv ypkk ypkk ypkk ypkk ypkk ypkk lnlqhmaohv lnlqhmaohv lnlqhmaohv lnlqhmaohv ypkk ypkk ypkk lnlqhmaohv lnlqhmaohv ypkk",
                "lnlqhmaohv",
                "ypkk")));
    }
}
