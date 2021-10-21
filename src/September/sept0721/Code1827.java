package September.sept0721;

public class Code1827 {
    public static int minOperations(int[] nums) {
        int totalCount = 0;
        int prevNum = 0;
        for (int i =0; i < nums.length; i++){
            while(nums[i] <= prevNum){
                nums[i]++;
                totalCount++;
            }
            prevNum = nums[i];
        }
        return totalCount;
    }

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{1,5,2,4,1}));
    }
}
