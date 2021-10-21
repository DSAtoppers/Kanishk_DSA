package September.sept2521;

public class Code1422 {

    public static int maxScore(String s) {
        int max=0;
        int count1=0;
        int count0=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count1++;
            }
        }

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                count0++;
            }
            else{
                count1--;
            }
            int d=count0+count1;
            if(d>max){
                max=d;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxScore("00111"));
    }
}
