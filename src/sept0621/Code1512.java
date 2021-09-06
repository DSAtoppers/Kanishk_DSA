package sept0621;

public class Code1512 {

    public static int numIdenticalPairs(int[] nums) {
        int num = 0;
        int totalPairs = 0;

        for(int i = 0; i < nums.length; i++){
            num = nums[i];
            for(int j = i+1; j < nums.length; j++){
                if(j > nums.length){
                    break;
                }

                if(nums[j] == num){
                    totalPairs++;
                }
            }
        }

        return totalPairs;
    }

    public static void main(String[] args) {
        System.out.println((numIdenticalPairs(new int[]{1,2,3,1,1,3})));
    }
}
