package Year2021.September.sept0721;

public class Code1816 {

    public static String truncateSentence(String s, int k) {
        String[] arr = s.split("\\s+");
        String finalString = "";
        for(int i = 1; i <= k; i++){
            if(i == k){
                finalString = finalString + arr[i-1];
            }else{
                finalString = finalString + arr[i-1] + " ";
            }
        }

        return finalString;
    }

    public static void main(String[] args) {
        System.out.println((truncateSentence("Hello how are you Contestant", 4)));
    }
}
