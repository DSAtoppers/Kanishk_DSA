package Year2021;

public class SwapItHarder {

    static void SwapInts(int[] array, int position1, int position2) {
        int temp = array[position1];
        array[position1] = array[position2];
        array[position2] = temp;
    }

    static int KSwapMaximum(int []arr, int n) {
        int swapsDone= 0;
        for (int i = 0; i < n - 1 ; ++i) {
            int indexPosition = i;
            for (int j = i + 1; j < n; ++j) {
                if (arr[j] > arr[indexPosition]){
                    indexPosition = j;
                    swapsDone++;
                }
            }

            for (int j = indexPosition; j > i; --j)
                SwapInts(arr, j, j - 1);

        }

        return swapsDone;
    }

    public static void main(String[] args) {
        int []arr = {4,0,6,0,1,9,8,0,4};
        int n = arr.length;
        System.out.println(KSwapMaximum(arr, n));
    }
}
