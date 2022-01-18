package Year2022.Jan;

import java.util.Arrays;

public class Problem3 {

    //This is brute force
    //Find better solution


    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            int total = 0;
            for (int j = 0; j < nums.length; j++){
                if (nums[i]-nums[j] > 0){
                    total++;
                }
            }
            ans[i] = total;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
}
