package Year2021.September.sept1121;

public class Code1588 {

    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j += 2) {
                for(int k = i; k <= j; k++) {
                    sum += arr[k];
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
