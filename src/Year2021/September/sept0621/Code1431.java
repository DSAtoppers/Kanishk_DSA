package Year2021.September.sept0621;

import java.util.ArrayList;
import java.util.List;

public class Code1431 {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int maxNum = 0;

        for (int candy : candies) {
            if (maxNum < candy) {
                maxNum = candy;
            }
        }

        for (int candy : candies) {
            if (candy + extraCandies >= maxNum) {
                list.add(true);
            } else {
                list.add(false);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println((kidsWithCandies(new int[]{2,3,5,1,3},3)));
    }
}
