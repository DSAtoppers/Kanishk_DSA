package Year2021.September.sept0821;

import java.util.Arrays;

public class Code1313 {

    public static int[] decompressRLElist(int[] nums)  {
        int size = 0;
        for (int i = 0; i < nums.length; i = i+2){
            size = size + nums[i];
        }

        int[] arr = new int[size];
        int lastFilled = 0;

        for (int i = 0; i < nums.length; i=i+2){
            int freq = nums[i];
            int num = nums[i+1];
            if (lastFilled == 0){
                addToArray(arr, freq, num, 0);
            }else{
                addToArray(arr, freq, num, lastFilled);
            }
            lastFilled = lastFilled + freq;
        }

        return arr;
    }

    static int[] addToArray(int[] arr, int freq,int num, int lastFilled){
        for (int i = lastFilled; i < freq+lastFilled; i++){
            arr[i] = num;
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(decompressRLElist(new int[]{1,2,3,4})));
    }
}
