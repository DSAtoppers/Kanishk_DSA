package September.sept0621;

import java.util.Arrays;

public class Code1920 {

    public static int[] buildArray(int[] nums) {

        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            arr[i] = nums[n];
        }

        return arr;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(buildArray(new int[]{0, 2, 1, 5, 3, 4})));
    }
}
