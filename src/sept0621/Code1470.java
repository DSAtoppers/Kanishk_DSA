package sept0621;

import java.util.Arrays;

public class Code1470 {

    public static int[] shuffle(int[] nums, int n) {
        int ind = 0;
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length/2; i++){
            arr[ind] = nums[i];
            arr[ind+1] =  nums[i+n];
            ind = ind + 2;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{2,5,1,3,4,7}, 3)));
    }
}
