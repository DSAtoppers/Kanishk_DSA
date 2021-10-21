package September.sept1021;

import java.util.Arrays;

public class Code821 {

    public static int[] shortestToChar(String s, char c) {
        int len = s.length();
        int[] ans = new int[len];
        ans[0] = s.charAt(0) == c ? 0 : 10001;

        for (int i = 1; i < len; i++){
            ans[i] = s.charAt(i) == c ? 0 : ans[i-1] + 1;
        }

        for (int i = len - 2; i >= 0; i--){
            ans[i] = Math.min(ans[i], ans[i+1] + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestToChar("aaab",'b')));
    }
}
