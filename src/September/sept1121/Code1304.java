package September.sept1121;

import java.util.Arrays;

public class Code1304 {

    public static int[] sumZero(int n) {
        int[] arr = new int[n];

        if (n == 1){
            return new int[]{0};
        }

        if (n%2 == 0){
            for (int i = 1; i <= n; i+=2){
                arr[i-1] = i;
                arr[i] = -i;
            }
        }else{
            arr[0] = 0;
            for (int i = 1; i <= n-1; i = i+2){
                arr[i] = i;
                arr[i+1] = -i;
            }
        }

        return arr;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(6)));
    }
}
