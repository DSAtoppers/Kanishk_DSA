package Year2021.September.sept0921;

import java.util.Arrays;

public class Code66 {

    public static int[] plusOne(int[] digits) {
        int ones = digits[digits.length-1];
        if (ones < 9){
            digits[digits.length-1] = digits[digits.length-1] +1;
        }else{
            digits = addOneToPlace(digits, digits.length-1);
        }

        return digits;
    }

    static int[] addOneToPlace(int[] digits, int place){
        if (place < 0){
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            return arr;
        }
        int sum = digits[place] + 1;
        if (sum == 10){
            digits[place] = 0;
            digits = addOneToPlace(digits,place-1);
        }else {
            digits[place] = digits[place] + 1;
        }

        return digits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1,2,3})));
    }
}
