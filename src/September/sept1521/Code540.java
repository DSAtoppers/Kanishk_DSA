package September.sept1521;

public class Code540 {
    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        if(nums.length == 0) {
            return 0;
        }
        else if(nums.length ==1){
            return nums[0];
        }
        else if(nums[0] != nums[1]) {
            return nums[0];
        }
        else if(nums[end] != nums[end-1]){
            return nums[end];
        }

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                return nums[mid];
            } else if(mid % 2 == 0) {
                if(nums[mid] == nums[mid+1]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else if(mid % 2 != 0) {
                if(nums[mid] == nums[mid-1]){
                    start = mid +1;
                }
                else{
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[]{1,1,2,3,3,4,4,8,8}));
    }
}
