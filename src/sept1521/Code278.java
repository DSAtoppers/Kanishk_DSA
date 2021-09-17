package sept1521;

public class Code278 {

    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int lastTrue = 0;

        while (start <= end){
            int mid = start + (end-start)/2;
            if (isBadVersion(mid)){
                lastTrue = mid;
                end = mid-1;
            }else if (!isBadVersion(mid)){
                start = mid+1;
            }
        }

        return lastTrue;
    }

    public static boolean isBadVersion(int n){
        return true;
    }


    public static void main(String[] args) {

    }
}
