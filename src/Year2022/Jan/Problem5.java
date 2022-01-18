package Year2022.Jan;

public class Problem5 {
    //https://leetcode.com/problems/shuffle-string/

    public static String restoreString(String s, int[] indices) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < indices.length; i++){
            arr[indices[i]] = s.charAt(i);
        }

        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        System.out.println(restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3}));
    }
}
