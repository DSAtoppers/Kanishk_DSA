package sept1321;

public class Code1539 {

    //Incomplete
    public static int findKthPositive(int[] arr, int k) {
//        int i = 1;
//        boolean find = false;
//            while (i <=1000){
//                int start = 0;
//                int end = arr.length-1;
//                while (start <= end){
//                    int mid = start + (end-start)/2;
//                    if (arr[mid] == i){
//                        find = true;
//                        break;
//                    }else if (arr[mid] > i){
//                        end = mid-1;
//                    }else if (arr[mid] < i){
//                        start = mid +1;
//                    }
//                }
//                if (!find){
//                    k--;
//                }
//                if (k == 0){
//                    return i;
//                }
//                i++;
//                find = false;
//            }
//
//        return i;


        int start=0, end=arr.length-1;

        while (start<end) {
            int mid = start + (end-start)/2;
            if (arr[mid]-(mid+1)>=k) {
                end=mid-1;
            } else {
                start=mid;
                if (arr[end]-(end+1)>=k) end--;
                else start++;
            }
        }

        if (arr[start]-(start+1)>=k) {
            return k;
        } else {
            return start+1+k;
        }

    }

    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[]{2,3,4,7,11},5));
    }
}
