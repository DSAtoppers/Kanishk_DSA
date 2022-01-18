package Year2021.September.sept1521;

import java.util.Arrays;

public class Code34 {

    public static int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;

        int start = 0;
        int end = nums.length-1;

        while (start <= end){
            int mid = start + (end-start)/2;
            if (nums[mid] == target){
                arr[0] = mid;
                end = mid-1;
            }else if (nums[mid] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        start = 0;
        end = nums.length-1;

        while (start <= end){
            int mid = start + (end-start)/2;
            if (nums[mid] == target){
                arr[1] = mid;
                start = mid+1;
            }else if (nums[mid] < target){
                start  = mid+1;
            }else{
                end = mid-1;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10}, 6)));
    }
}
