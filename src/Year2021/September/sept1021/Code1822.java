package Year2021.September.sept1021;

public class Code1822 {

    public static int arraySign(int[] nums) {
        int countNeg = 0;
        int zero = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                countNeg++;
            }else if(nums[i] == 0){
                zero++;
            }
        }

        if (zero > 0){
            return 0;
        }else if(countNeg%2 == 0){
            return 1;
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(arraySign(new int[]{-1,-2,-3,-4,3,2,1}));
    }
}
