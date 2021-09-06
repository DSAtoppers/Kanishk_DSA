package sept0621;

import java.util.Arrays;

public class Code1929 {

    public static int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length*2];
        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            arr[i] = n;
            arr[i+nums.length] = n;
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1, 2, 1})));
    }
}
