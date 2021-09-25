package sept2521;

public class Code1758 {

    //Incomplete
    public static int minOperations(String s) {
        char[] arr = s.toCharArray();
        int operations1 = 0;
        int operations0 = 0;
        char startWith1 = '1';
        char startWith0 = '0';

        if (arr[0] == startWith0){
            char last = arr[0];
            for (int i = 1; i < arr.length; i++){
                if (last == arr[i]){
                    operations0++;
                    last = '1';
                }
            }
        }else {

        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(minOperations("10010100"));
    }
}
