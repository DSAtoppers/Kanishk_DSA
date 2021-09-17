package sept1521;

public class Code633 {

    public static boolean judgeSquareSum(int c) {
        long a = 0;
        long b = (int) Math.sqrt(c);
        while (a <= b){
            if (a*a + b*b < c){
                a++;
            }else if(a*a + b*b > c){
                b--;
            }else{
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(2147483600));
    }
}
