package September.sept0621;

public class Code1672 {

    public static int maximumWealth(int[][] accounts) {
        int maxSum = -1;
        for(int i = 0 ; i < accounts.length; i++){
            int[] arr = accounts[i];
            int sum = totalSum(arr);
            if(maxSum < sum){
                maxSum = sum;
            }
        }

        return maxSum;

    }

    private static int totalSum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        arr[0] = new int[]{1, 2, 3};
        arr[1] = new int[]{1, 2, 3};
        System.out.println((maximumWealth(arr)));
    }
}
