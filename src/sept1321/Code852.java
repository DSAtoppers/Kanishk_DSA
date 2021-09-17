package sept1321;

public class Code852 {
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        int result = 0;

        while (start <=end){
            int mid = start + (end-start)/2;
            if (mid > 0){
                if (arr[mid] > arr[result]){
                    result = mid;
                }
                if (arr[mid-1] > arr[mid]){
                    end = mid-1;
                    result = mid-1;
                }else{
                    start = mid+1;
                }
            }else {
                return result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[]{0,10,5,2}));
    }
}
