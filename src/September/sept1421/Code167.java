package September.sept1421;

import java.util.Arrays;

public class Code167 {

    public static int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2];
        int left=0;
        int right=numbers.length-1;

        while(left<right) {
            int sum=numbers[left]+numbers[right];
            if(sum==target) {
                result[0]=left+1;
                result[1]=right+1;
                break;
            }
            else if(sum>target){
                right--;
            }
            else{
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15},9)));
    }
}
