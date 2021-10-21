package September.sept1021;

public class Code1991 {

    public static int findMiddleIndex(int[] nums) {
        int finalIndex = -1;

        for (int i = 0; i < nums.length; i++){
            int leftSum = leftSum(nums,i);
            int rightSum = rightSum(nums,i);

            if (leftSum == rightSum){
                finalIndex = i;
                break;
            }
        }

        return finalIndex;
    }

    public static int leftSum(int[] arr, int index){
        int total = 0;

        if (index == 0){
            return 0;
        }
        for (int i = 0; i < index; i++){
            total = total + arr[i];
        }

        return total;
    }

    public static int rightSum(int[] arr,int index){
        int total = 0;
        if (index == arr.length-1){
            return 0;
        }

        for (int i = index+1; i < arr.length; i++){
            total = total + arr[i];
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(findMiddleIndex(new int[]{2}));
    }
}
