package Year2021.September.sept0621;

import java.util.Arrays;

public class Code1480 {

    public static int[] runningSum(int[] nums) {
        int totalSum = 0;
        int[] arr = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            totalSum = totalSum + nums[i];
            arr[i] = totalSum;
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1,2,3,4})));
    }
}
