package Year2021.September.sept2421;

public class Code1446 {
    public static int maxPower(String s) {
        char[] arr = s.toCharArray();
        int length = 1;
        int highest = 1;
        char first = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] == first){
                length++;
                if (highest < length){
                    highest = length;
                }
            }else{
                length = 1;
                first = arr[i];
            }
        }

        return highest;
    }

    public static void main(String[] args) {
        System.out.println(maxPower( "leetcode"));
    }


}
