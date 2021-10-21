package ExtraCoding;

import java.util.Stack;

public class TwoSummation {

    public static int solve(int[] A, int[] B) {
        int finalResult = 0;
        int sumOf1Num,sumOf2Num;
        int k = 0, j = 0;

        for(int i=0; i <= A.length*A.length + A.length-2; i++) {
            if (j < A.length){
                sumOf1Num=A[k]+B[j];
                sumOf2Num=B[k]+A[j];
                int tempSum =Math.max(sumOf1Num,sumOf2Num);
                finalResult = finalResult + tempSum;
                j++;
            }else{
                j = 0;
                k++;
            }
        }

        return finalResult;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,2}, new int[]{2,3}));
    }
}
