package Year2021.September.sept0721;

import java.util.List;

public class Code1773 {

    //Runtime 8ms

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int sum = 0;
        for (List<String> item : items) {
            if (ruleKey.equals("type")) {
                if (ruleValue.equals(item.get(0))) {
                    sum++;
                }
            } else if (ruleKey.equals("color")) {
                if (ruleValue.equals(item.get(1))) {
                    sum++;
                }
            } else if (ruleKey.equals("name")) {
                if (ruleValue.equals(item.get(2))) {
                    sum++;
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {

    }
}
