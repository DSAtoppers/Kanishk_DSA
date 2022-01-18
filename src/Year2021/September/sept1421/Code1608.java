package Year2021.September.sept1421;

public class Code1608 {
    // array - nums
    // nums special - x, x numbers in nums that are greater than or equal to x

    public static int specialArray(int[] nums) {
        int count = 0;
        for (int i = 0; i< nums.length+1; i++){
            for (int j = 0; j < nums.length; j++){
                if (nums[j] >= i){
                    count++;
                }
            }

            if (count == i){
                return count;
            }else{
                count = 0;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(specialArray(new int[]{3,6,7,7,0}));
    }
}
